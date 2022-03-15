
public class Auth {
    private String email;
    private String password;
    private AuthType type;
    private String userId;

    private Auth(String email, String password, AuthType type, String userId) {
        this.email = email;
        this.password = password;
        this.type = type;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    static Auth get(String email, String password) {
        // get Authentication information from server.
        return null;
    }
}
