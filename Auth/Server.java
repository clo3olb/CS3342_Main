package Auth;

import java.util.ArrayList;

class AuthData {
    private Auth auth;
    private UserType type;
    private String userId;

    AuthData(Auth auth, UserType type, String userId) {
        this.auth = auth;
        this.type = type;
        this.userId = userId;
    }

    public UserType authenticate(Auth theAuth) {
        if (!this.auth.getEmail().equals(theAuth.getEmail()))
            return null;
        if (!this.auth.getPassword().equals(theAuth.getPassword()))
            return null;
        return this.type;
    }
}

public class Server {
    // Singleton
    private static final Server theAuthServer = new Server();

    private ArrayList<AuthData> authDB = new ArrayList<AuthData>();

    private Server() {
    }

    static Server getInstance() {
        return theAuthServer;
    }

    public UserType authenticate(Auth auth) {
        for (AuthData authData : authDB) {
            UserType userType = authData.authenticate(auth);
            if (userType != null) {
                return userType;
            }
        }
        return null;
    }
}
