import java.util.ArrayList;
import java.util.Date;

class Ticket {
    private String ticketId;
    private String eventId;
    private String userId;
    private Payment payment;

    Ticket() {

    }

    public String getUserId() {
        return userId;
    }
}

public class TicketManager {
    // Singleton
    private static final TicketManager theTicketServer = new TicketManager();

    private ArrayList<Ticket> ticketDB = new ArrayList<Ticket>();

    private TicketManager() {
    }

    static TicketManager getInstance() {
        return theTicketServer;
    }

    private ArrayList<Ticket> findAll(Auth auth) {
        if (!auth.isCustomer())
            return new ArrayList<Ticket>();
        ArrayList<Ticket> tickets = (ArrayList<Ticket>) this.ticketDB.clone();
        tickets.removeIf(ticket -> ticket.getUserId().equals(auth.getUserId()));
        return tickets;
    }

}
