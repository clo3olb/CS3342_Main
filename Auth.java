class CustomerAuth extends Auth {
    CustomerAuth(String email, String password, User user) {
        super(email, password, user);
    }
}

class OrganizerAuth extends Auth {
    OrganizerAuth(String email, String password, User user) {
        super(email, password, user);
    }
}

class AdministratorAuth extends Auth {
    AdministratorAuth(String email, String password, User user) {
        super(email, password, user);
    }
}

abstract class Auth {
    private String email;
    private String password;
    private User user;

    Auth(String email, String password, User user) {
        this.email = email;
        this.password = password;
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

    static Auth get(String email, String password) {
        // get Authentication information from server.
        // it returns auth with corresponding type.
        // CustomerAuth, OrganizerAuth, AdministratorAuth
        return null;
    }
}
