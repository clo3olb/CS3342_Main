class EventServer {
    private static final EventServer theEventServer = new EventServer();
    private Event[] allEvents = new Event[];

    private EventServer() {

    }

    public static EventServer getInstance() {
        return theEventServer;
    }

    static void createEvent() {

    }
}

class Test {
    public static void main() {
        EventServer server = EventServer.getInstance();
    }
}