package Auth;

public class Auth {
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
        UserType userType = Server.getInstance().authenticate(this);
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