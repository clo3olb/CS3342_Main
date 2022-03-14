package Auth;

import java.util.ArrayList;

class Server {
    // Singleton
    private static final Server theAuthServer = new Server();

    private ArrayList<Auth> authDB = new ArrayList<Auth>();

    private Server() {
    }

    public static Server getInstance() {
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

    // public boolean register(String email, String password) {

    // }

}
