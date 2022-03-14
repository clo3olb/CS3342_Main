public class Organizing { //Association Entity between Organizer and Event
    private Organizer organizer;
    private Event event;

    public Organizing(Organizer organizer, Event event) {
        this.organizer = organizer;
        this.event = event;
    }
}