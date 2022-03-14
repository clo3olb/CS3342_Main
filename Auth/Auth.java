package Auth;

class Auth {
    private String email;
    private String password;
    private UserType type;

    Auth(String email, String password, UserType type) {
        this.email = email;
        this.password = password;
        this.type = type;
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