import java.util.ArrayList;

public interface ServiceInterface { //Created to implement DIP
    public void createAsset(String userId);
    public Asset searchByID(String id);
    public ArrayList<Asset> getUserAssets(String userId);
}
