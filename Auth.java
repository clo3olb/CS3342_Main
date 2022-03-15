
public class Auth {
    private String email;
    private String password;
    private AuthType type;
    private String userId;

    Auth(String email, String password, AuthType type, String userId) {
        this.email = email;
        this.password = password;
        this.type = type;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public boolean authenticate(Auth auth) {
        return authenticate(auth.email, auth.password);
    }

    public boolean authenticate(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password))
            return true;
        return false;
    }

    public boolean isCustomer() {
        return this.type.getType().equals("Customer");
    }

    public boolean isOrganizer() {
        return this.type.getType().equals("Organizer");
    }

    public boolean isAdministrator() {
        return this.type.getType().equals("Administrator");
    }
}
