
interface AuthType {
    public String getType();
}

class CustomerType implements AuthType {
    public String getType() {
        return "Customer";
    }
}

class OrganizerType implements AuthType {
    public String getType() {
        return "Organizer";
    }
}

class AdministratorType implements AuthType {
    public String getType() {
        return "Administrator";
    }
}