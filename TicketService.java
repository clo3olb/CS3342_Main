import java.util.ArrayList;
import java.util.Date;

class TicketService implements ServiceInterface {
    private String ticketId;
    private String eventId;
    private String userId;
    private Payment payment;

    public String getUserId() {
        return userId;
    }

    @Override
    public void createAsset() {
        // Create Ticket Object
    }

    @Override
    public Asset searchByID(String id) {
        // return 
        return null;
    }

    @Override
    public ArrayList<Asset> getUserAssets(String userId) {
        // TODO Auto-generated method stub
        return null;
    }
}