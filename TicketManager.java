import java.util.ArrayList;
import java.util.Date;

class Ticket {
    private String ticketId;
    private String eventId;
    private String userId;
    private Payment payment;

    public String getUserId() {
        return userId;
    }

    static ArrayList<Ticket> getUserTickets(Auth auth) {
        // get tickets of user depending on the auth provided.
        return null;
    }
}