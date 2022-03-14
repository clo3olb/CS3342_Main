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

public class TicketManager {
    // Singleton
    private static final TicketManager theTicketServer = new TicketManager();

    private ArrayList<AuthData> authDB = new ArrayList<AuthData>();

    private TicketManager() {
    }

    static TicketManager getInstance() {
        return theTicketServer;
    }

}
