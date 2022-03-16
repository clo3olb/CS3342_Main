import java.util.ArrayList;

class EventService implements ServiceInterface { //Apply DIP
    private static final EventService theEventService = new EventService();
    private static ArrayList<Event> allEvents;

    // ===============

    private EventService() {
        allEvents = new ArrayList<>();
    }

    public static EventService getInstance() {
        return theEventService;
    }

    @Override
    public void createAsset(String userId) {
        // get user input to create Event, Ticket, etc...
        // save the asset into ArrayList
    }

    @Override
    public Asset searchByID(String id) {
        // return the found asset
        return null;
    }

    @Override
    public ArrayList<Asset> getUserAssets(String userId) {
        // search from allEvents and make a new ArrayList
        // return all the assets as an ArrayList that are of user's
        return null;
    }

    public ArrayList<Asset> getRecommandedEvents(String userId) {
        // return recommended assets based on user (location & prefereces)
        return null;
    }
}