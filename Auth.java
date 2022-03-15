class CustomerAuth extends Auth {
    CustomerAuth(String email, String password, String userId) {
        super(email, password, userId);
    }
}

class OrganizerAuth extends Auth {
    OrganizerAuth(String email, String password, String userId) {
        super(email, password, userId);
    }
}

class AdministratorAuth extends Auth {
    AdministratorAuth(String email, String password, String userId) {
        super(email, password, userId);
    }
}

abstract class Auth {
    private String email;
    private String password;
    private String userId;

    Auth(String email, String password, String userId) {
        this.email = email;
        this.password = password;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    static Auth get(String email, String password) {
        // get Authentication information from server.
        // it returns auth with corresponding type.
        // CustomerAuth, OrganizerAuth, AdministratorAuth
        return null;
    }
}
