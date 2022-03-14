
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