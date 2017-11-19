
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GenerateStudentIdResponse_QNAME = new QName("http://server/", "generateStudentIdResponse");
    private final static QName _BookRoom_QNAME = new QName("http://server/", "bookRoom");
    private final static QName _LookupStudent_QNAME = new QName("http://server/", "lookupStudent");
    private final static QName _GenerateStudentId_QNAME = new QName("http://server/", "generateStudentId");
    private final static QName _CancelBookingResponse_QNAME = new QName("http://server/", "cancelBookingResponse");
    private final static QName _ChangeBooking_QNAME = new QName("http://server/", "changeBooking");
    private final static QName _CancelBooking_QNAME = new QName("http://server/", "cancelBooking");
    private final static QName _LookupStudentResponse_QNAME = new QName("http://server/", "lookupStudentResponse");
    private final static QName _BookRoomResponse_QNAME = new QName("http://server/", "bookRoomResponse");
    private final static QName _ChangeBookingResponse_QNAME = new QName("http://server/", "changeBookingResponse");
    private final static QName _GetAvailableTimeSlotsResponse_QNAME = new QName("http://server/", "getAvailableTimeSlotsResponse");
    private final static QName _GetAvailableTimeSlots_QNAME = new QName("http://server/", "getAvailableTimeSlots");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookRoomResponse }
     * 
     */
    public BookRoomResponse createBookRoomResponse() {
        return new BookRoomResponse();
    }

    /**
     * Create an instance of {@link ChangeBookingResponse }
     * 
     */
    public ChangeBookingResponse createChangeBookingResponse() {
        return new ChangeBookingResponse();
    }

    /**
     * Create an instance of {@link GetAvailableTimeSlotsResponse }
     * 
     */
    public GetAvailableTimeSlotsResponse createGetAvailableTimeSlotsResponse() {
        return new GetAvailableTimeSlotsResponse();
    }

    /**
     * Create an instance of {@link GetAvailableTimeSlots }
     * 
     */
    public GetAvailableTimeSlots createGetAvailableTimeSlots() {
        return new GetAvailableTimeSlots();
    }

    /**
     * Create an instance of {@link LookupStudentResponse }
     * 
     */
    public LookupStudentResponse createLookupStudentResponse() {
        return new LookupStudentResponse();
    }

    /**
     * Create an instance of {@link CancelBooking }
     * 
     */
    public CancelBooking createCancelBooking() {
        return new CancelBooking();
    }

    /**
     * Create an instance of {@link GenerateStudentId }
     * 
     */
    public GenerateStudentId createGenerateStudentId() {
        return new GenerateStudentId();
    }

    /**
     * Create an instance of {@link CancelBookingResponse }
     * 
     */
    public CancelBookingResponse createCancelBookingResponse() {
        return new CancelBookingResponse();
    }

    /**
     * Create an instance of {@link ChangeBooking }
     * 
     */
    public ChangeBooking createChangeBooking() {
        return new ChangeBooking();
    }

    /**
     * Create an instance of {@link LookupStudent }
     * 
     */
    public LookupStudent createLookupStudent() {
        return new LookupStudent();
    }

    /**
     * Create an instance of {@link GenerateStudentIdResponse }
     * 
     */
    public GenerateStudentIdResponse createGenerateStudentIdResponse() {
        return new GenerateStudentIdResponse();
    }

    /**
     * Create an instance of {@link BookRoom }
     * 
     */
    public BookRoom createBookRoom() {
        return new BookRoom();
    }

    /**
     * Create an instance of {@link TimeSlot }
     * 
     */
    public TimeSlot createTimeSlot() {
        return new TimeSlot();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateStudentIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "generateStudentIdResponse")
    public JAXBElement<GenerateStudentIdResponse> createGenerateStudentIdResponse(GenerateStudentIdResponse value) {
        return new JAXBElement<GenerateStudentIdResponse>(_GenerateStudentIdResponse_QNAME, GenerateStudentIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "bookRoom")
    public JAXBElement<BookRoom> createBookRoom(BookRoom value) {
        return new JAXBElement<BookRoom>(_BookRoom_QNAME, BookRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "lookupStudent")
    public JAXBElement<LookupStudent> createLookupStudent(LookupStudent value) {
        return new JAXBElement<LookupStudent>(_LookupStudent_QNAME, LookupStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateStudentId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "generateStudentId")
    public JAXBElement<GenerateStudentId> createGenerateStudentId(GenerateStudentId value) {
        return new JAXBElement<GenerateStudentId>(_GenerateStudentId_QNAME, GenerateStudentId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "cancelBookingResponse")
    public JAXBElement<CancelBookingResponse> createCancelBookingResponse(CancelBookingResponse value) {
        return new JAXBElement<CancelBookingResponse>(_CancelBookingResponse_QNAME, CancelBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "changeBooking")
    public JAXBElement<ChangeBooking> createChangeBooking(ChangeBooking value) {
        return new JAXBElement<ChangeBooking>(_ChangeBooking_QNAME, ChangeBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "cancelBooking")
    public JAXBElement<CancelBooking> createCancelBooking(CancelBooking value) {
        return new JAXBElement<CancelBooking>(_CancelBooking_QNAME, CancelBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "lookupStudentResponse")
    public JAXBElement<LookupStudentResponse> createLookupStudentResponse(LookupStudentResponse value) {
        return new JAXBElement<LookupStudentResponse>(_LookupStudentResponse_QNAME, LookupStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "bookRoomResponse")
    public JAXBElement<BookRoomResponse> createBookRoomResponse(BookRoomResponse value) {
        return new JAXBElement<BookRoomResponse>(_BookRoomResponse_QNAME, BookRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "changeBookingResponse")
    public JAXBElement<ChangeBookingResponse> createChangeBookingResponse(ChangeBookingResponse value) {
        return new JAXBElement<ChangeBookingResponse>(_ChangeBookingResponse_QNAME, ChangeBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableTimeSlotsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAvailableTimeSlotsResponse")
    public JAXBElement<GetAvailableTimeSlotsResponse> createGetAvailableTimeSlotsResponse(GetAvailableTimeSlotsResponse value) {
        return new JAXBElement<GetAvailableTimeSlotsResponse>(_GetAvailableTimeSlotsResponse_QNAME, GetAvailableTimeSlotsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableTimeSlots }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAvailableTimeSlots")
    public JAXBElement<GetAvailableTimeSlots> createGetAvailableTimeSlots(GetAvailableTimeSlots value) {
        return new JAXBElement<GetAvailableTimeSlots>(_GetAvailableTimeSlots_QNAME, GetAvailableTimeSlots.class, null, value);
    }

}
