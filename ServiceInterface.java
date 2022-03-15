import java.util.ArrayList;

public interface ServiceInterface { //Created to implement DIP
    public void create();
    public Searchable searchByID(String id);
    public ArrayList<Searchable> getUserAssets(String userId);
}
