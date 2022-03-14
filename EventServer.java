import java.util.ArrayList;
import Auth.*;

class EventServer {
    private static final EventServer theEventServer = new EventServer();
    private static ArrayList<Organizing> allOrganizes;

    //===============

    private EventServer() {
        allOrganizes = new ArrayList<>();
    }

    public static EventServer getInstance() {
        return theEventServer;
    }

    //===============

    public void createEvent(Auth a, Organizer o, Event e) {
        if(!a.isOrganizer()) { return; } //Authentication
        allOrganizes.add(new Organizing(o, e));
    }
}