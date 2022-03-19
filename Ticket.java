<<<<<<< HEAD
public class Ticket implements Asset {
    String id;
    
    public boolean compareID(String id) {
        return this.id.equals(id);
=======

class Ticket {
    private String ticketId;
    private Event event;
    private User owner;
    private Payment payment;

    Ticket() {

>>>>>>> f79538df45309b59b0a127e9a7074cf591eba738
    }

    static Ticket create(Event event, User user) {
        // creates ticket of the event and set owner to the user.
        return null;
    }

}
