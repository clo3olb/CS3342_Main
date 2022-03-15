
import java.util.ArrayList;

public class AuthService {
    // Singleton
    private static final AuthService theAuthServer = new AuthService();

    private ArrayList<Auth> authDB = new ArrayList<Auth>();

    private AuthService() {
    }

    public static AuthService getInstance() {
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
