import java.util.ArrayList;

class Auth {
    private String email;
    private String password;

    Auth(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    private boolean checkType(String typeName) {
        UserType userType = AuthServer.getInstance().authenticate(this);
        if (userType == null)
            return false;
        if (userType.getType().equals(typeName))
            return true;
        return false;
    }

    public boolean isCustomer() {
        return checkType("Customer");
    }

    public boolean isOrganizer() {
        return checkType("Organizer");
    }

    public boolean isAdministrator() {
        return checkType("Administrator");
    }
}

interface UserType {
    public String getType();
}

class CustomerType implements UserType {
    public String getType() {
        return "Customer";
    }
}

class OrganizerType implements UserType {
    public String getType() {
        return "Organizer";
    }
}

class AdministratorType implements UserType {
    public String getType() {
        return "Administrator";
    }
}

class AuthData {
    private Auth auth;
    private UserType type;

    AuthData(Auth auth, UserType type) {
        this.auth = auth;
        this.type = type;
    }

    public UserType authenticate(Auth theAuth) {
        if (!this.auth.getEmail().equals(theAuth.getEmail()))
            return null;
        if (!this.auth.getPassword().equals(theAuth.getPassword()))
            return null;
        return this.type;
    }
}

public class AuthServer {
    // Singleton
    private static final AuthServer theAuthServer = new AuthServer();

    private ArrayList<AuthData> authDB = new ArrayList<AuthData>();

    private AuthServer() {
    }

    static AuthServer getInstance() {
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
