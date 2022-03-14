import java.util.ArrayList;
import java.util.Date;

class Place {
    private String placeName;

    public String getPlaceName() {
        return placeName;
    }
}

class Ticket {
    private Place place;
    private Date date;

    Ticket() {
        this.date = new Date();
    }
}

public class TicketServer {
    // Singleton
    private static final TicketServer theTicketServer = new TicketServer();

    private ArrayList<AuthData> authDB = new ArrayList<AuthData>();

    private TicketServer() {
    }

    static TicketServer getInstance() {
        return theTicketServer;
    }

}
