import java.util.Date;

public class Event implements Asset {
    private String id;
    private String title;
    private String venue;
    private String date;
    private Organizer organizer;

    public Event(Organizer organizer, String id, String title, String venue, String date) {
        this.title = title;
        this.venue = venue;
        this.date = date;
        this.organizer = organizer;
    }

    @Override
    public boolean compareID(String id) {
        // return true if 
        return false;
    }
}
