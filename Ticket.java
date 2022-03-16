public class Ticket implements Asset {
    String id;
    
    public boolean compareID(String id) {
        return this.id.equals(id);
    }
}
