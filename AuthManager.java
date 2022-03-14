
import java.util.ArrayList;

public class AuthManager {
    // Singleton
    private static final AuthManager theAuthServer = new AuthManager();

    private ArrayList<Auth> authDB = new ArrayList<Auth>();

    private AuthManager() {
    }

    public static AuthManager getInstance() {
        return theAuthServer;
    }

    public Auth authenticate(String email, String password) {
        for (Auth auth : authDB) {
            if (auth.authenticate(email, password)) {
                return auth;
            }
        }
        return null;
    }
}
