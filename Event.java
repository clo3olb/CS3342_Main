import java.util.Date;

public class Event {
    private String title;
    private String venue;
    private String date; //Date class 를 만들까?? 너무 사소한듯
    private Organizer organizer;

    public Event(Organizer organizer, String title, String venue, String date) {
        this.title = title;
        this.venue = venue;
        this.date = date;
        this.organizer = organizer;
    }
}
