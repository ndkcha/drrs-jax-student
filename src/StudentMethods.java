import server.StudentOperations;
import server.TimeSlot;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;

public class StudentMethods {
    private StudentOperations studentOps;
    private Logger logs;

    StudentMethods(StudentOperations studentOps, Logger logs) {
        this.studentOps = studentOps;
        this.logs = logs;
    }

    boolean bookRoom(Scanner scan, String studentId) {
        boolean success = false, isCodeFound = false;
        String code, start, end, date, bookingId, strAvailTimeSlots;
        String[] strAts;
        int roomNo;
        TimeSlot slot;
        HashMap<String, Integer> availableTimeSlots = new HashMap<>();

        System.out.print("Enter the date for which you want to book the room (format: dd-MM-yyyy, e.g. 11-01-2018)\n :");
        date = scan.nextLine();

        strAvailTimeSlots = studentOps.getAvailableTimeSlots(date);

        System.out.println("\nAvailable time-slot(s):");

        strAts = strAvailTimeSlots.split(";");
        for (String item : strAts) {
            String[] ats = item.split(",");
            availableTimeSlots.put(ats[0], Integer.parseInt(ats[1]));
            System.out.println(ats[0] + " " + ats[1]);
        }

        System.out.print("\nEnter the campus code: ");
        code = scan.nextLine();

        // user gave wrong campus code. no booking.
        isCodeFound = availableTimeSlots.containsKey(code);

        if (!isCodeFound) {
            this.logs.warning("The campus does not exist!");
            return false;
        }

        System.out.print("Enter the room number: ");
        roomNo = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the 'start time' for time slot (format: hh:mm): ");
        start = scan.nextLine();

        System.out.print("Enter the 'end time' for time slot (format: hh:mm): ");
        end = scan.nextLine();

        slot = new TimeSlot();
        slot.setStartTime(start);
        slot.setEndTime(end);

        bookingId = this.studentOps.bookRoom(studentId, code, date, roomNo, slot);

        if (bookingId != null) {
            if (bookingId.startsWith("BKG")) {
                success = true;
                System.out.println("\nYour booking id: " + bookingId + "\n");
            } else {
                success = false;
                this.logs.warning(bookingId);
            }
        }

        return success;
    }

    boolean cancelBooking(Scanner scan, String studentId) {
        boolean success;
        String bookingId;

        System.out.print("Enter the bookingId: ");
        bookingId = scan.nextLine();

        success = this.studentOps.cancelBooking(studentId, bookingId);

        return success;
    }

    boolean changeBooking(Scanner scan) {
        boolean success = false, isCodeFound = false;
        String code, start, end, date, bookingId, newBookingId, strAvailTimeSlots;
        String[] strAts;
        int roomNo;
        TimeSlot slot;
        HashMap<String, Integer> availableTimeSlots = new HashMap<>();

        System.out.print("Enter the bookingId: ");
        bookingId = scan.nextLine();

        System.out.println("New booking details -");
        System.out.print("Enter the date for which you want to book the room (format: dd-MM-yyyy, e.g. 11-01-2018)\n :");
        date = scan.nextLine();

        strAvailTimeSlots = this.studentOps.getAvailableTimeSlots(date);

        System.out.println("\nAvailable time-slot(s):");

        // print
        strAts = strAvailTimeSlots.split(";");
        for (String item : strAts) {
            String[] ats = item.split(",");
            availableTimeSlots.put(ats[0], Integer.parseInt(ats[1]));
            System.out.println(ats[0] + " " + ats[1]);
        }

        System.out.print("\nEnter the campus code: ");
        code = scan.nextLine();

        // user gave wrong campus code. no booking.
        isCodeFound = availableTimeSlots.containsKey(code);

        if (!isCodeFound) {
            this.logs.warning("The campus does not exist!");
            return false;
        }

        System.out.print("Enter the room number: ");
        roomNo = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the 'start time' for time slot (format: hh:mm): ");
        start = scan.nextLine();

        System.out.print("Enter the 'end time' for time slot (format: hh:mm): ");
        end = scan.nextLine();

        slot = new TimeSlot();
        slot.setStartTime(start);
        slot.setEndTime(end);

        newBookingId = this.studentOps.changeBooking(bookingId, code, date, roomNo, slot);

        if (newBookingId != null) {
            if (newBookingId.startsWith("BKG")) {
                success = true;
                System.out.println("\nYour new booking id: " + newBookingId + ".\nDiscard the old booking id.");
            } else {
                success = false;
                this.logs.warning(newBookingId);
            }
        }

        return success;
    }
}
