import server.StudentOperations;
import server.StudentOperationsService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class StudentClient {
    public static void main(String[] args) {
        boolean isExitRequested = false, success;
        int choice, wsPort = -1;
        String message, code, response, studentId = null, servers;
        StudentOperations studentOps;
        StudentOperationsService service;
        StudentMethods methods;
        Logger logs = Logger.getLogger("Student Client");
        Scanner scan = new Scanner(System.in);

        // no list. exit.
        if (args.length != 1) {
            System.out.println("Usage: java StudentClient <server-directory>\nWhere, <server-directory> is the list of servers available to the client");
            return;
        }

        System.out.print("Do you have a studentId? (y/n): ");
        response = scan.nextLine();

        if (response.equalsIgnoreCase("y")) {
            System.out.print("\nEnter your studentId: ");
            studentId = scan.nextLine();
            code = studentId.substring(0, 3).toUpperCase();
        } else {
            System.out.print("\nEnter the campus code you're in: ");
            code = scan.nextLine();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            servers = reader.readLine();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            return;
        }

        // add the network of campus servers to the memory
        String[] campusList = servers.split(";");
        for (String item : campusList) {
            String[] campusDetails = item.split(",");
            if (campusDetails[0].equalsIgnoreCase(code)) {
                wsPort = Integer.parseInt(campusDetails[1]);
                break;
            }
        }

        if (wsPort == -1) {
            logs.severe("No campus found!");
            return;
        }

        try {
            URL url = new URL("http://localhost:" + wsPort + "/student?wsdl");

            service = new StudentOperationsService(url);
        } catch (MalformedURLException urlException) {
            logs.severe("There has been a problem with URL.\nMessage: " + urlException.getMessage());
            return;
        }

        // get the remote reference from the webservice
        studentOps = service.getStudentOperationsPort();

        // no remote. no work.
        if (studentOps == null) {
            logs.severe("Error initializing web services object. Try again later!");
            return;
        }

        // initialize implementation class for the client
        methods = new StudentMethods(studentOps, logs);

        if (studentId == null) {
            studentId = studentOps.generateStudentId();
            System.out.println("\nYour new studentId is " + studentId + ".\n");
        }

        // look up studentId at server
        if (!studentOps.lookupStudent(studentId)) {
            logs.warning("No entry found for the studentId, " + studentId);
            return;
        }

        // set up file handler for logging mechanism.
        try {
            FileHandler handler = new FileHandler(studentId + ".log", true);
            logs.addHandler(handler);
        } catch (IOException ioe) {
            logs.warning("Error initializing log file.\n Message: " + ioe.getMessage());
        }

        // be nice
        System.out.println("\tWelcome to the campus!\n");

        do {
            // ask what to do
            System.out.print("What do you want to do?\n\t1. Book a room\n\t2. Cancel booking\n\t3. Change booking\nAny other number to exit\n : ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                // create a room
                case 1:
                    success = methods.bookRoom(scan, studentId);
                    message = success ? "A room has successfully been booked." : "An unexpected error thrown while booking a room.";
                    break;
                // cancel booking
                case 2:
                    success = methods.cancelBooking(scan, studentId);
                    message = success ? "The booking has been cancelled successfully" : "An unexpected error thrown while cancelling the booking.";
                    break;
                // change booking
                case 3:
                    success = methods.changeBooking(scan);
                    message = success ? "The booking has been changed successfully" : "An unexpected error thrown while changing the booking.";
                    break;
                // exit
                default:
                    message = "Exit requested! Have a nice day!";
                    success = true;
                    isExitRequested = true;
                    break;
            }

            if (success)
                logs.info(message);
            else
                logs.warning(message);
        } while (!isExitRequested);

        scan.close();
    }
}
