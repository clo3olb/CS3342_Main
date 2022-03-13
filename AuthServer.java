
class Auth {
    private String email;
    private String password;

    Auth(String email, String password) {
        this.email = email;
        this.password = password;
    }
}

public class AuthServer {
    // Singleton
    private static private static final AuthServer theAuthServer = new AuthServer();

    private AuthServer() {
    }

    static AuthServer getInstance() {
        return theAuthServer;
    }

}
