import java.util.ArrayList;
import Auth.*;

class EventServer {
    private static final EventServer theEventServer = new EventServer();
    private ArrayList<Event> allEvents = new ArrayList<>();

    //===============

    private EventServer() {
    }

    public static EventServer getInstance() {
        return theEventServer;
    }

    //===============

    static void createEvent(Auth a) {
        if(!a.isOrganizer()) {

        }
    }
}