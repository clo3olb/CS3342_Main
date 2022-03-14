import java.util.ArrayList;

class EventManager {
    private static final EventManager theEventManager = new EventManager();
    private static ArrayList<Organizing> allOrganizes;

    // ===============

    private EventManager() {
        allOrganizes = new ArrayList<>();
    }

    public static EventManager getInstance() {
        return theEventManager;
    }

    // ===============

    Event.SearchEventById()
    // For Organizers
    public void createEvent(Auth a, Event e) {

        if (!a.isOrganizer()) {
            return;
        } // Authentication
        allOrganizes.add(new Organizing(o, e));
    }

    public ArrayList<Event> viewMyEvents(Auth auth) {
        
        return new ArrayList<Event>();
    }

    public ArrayList<Event> viewRecommendedEvents() {
        // returns list of my events
        return new ArrayList<Event>();
    }
}