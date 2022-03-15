import java.util.ArrayList;

abstract class UserFunction {
    private String description;

    UserFunction(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    abstract public void execute();
}

public class User {
    private Auth auth;
    private ArrayList<UserFunction> functions;

    public Auth authenticate(String email, String password) {
        return AuthService.getInstance().authenticate(email, password);
    }
}

abstract class CustomerFunction extends UserFunction {
    CustomerFunction(String description) {
        super(description);
        // TODO Auto-generated constructor stub
    }

    abstract public void execute();
}

abstract class OrganizerFunction extends CustomerFunction implements UserFunction {
    OrganizerFunction(String description) {
        super(description);
        // TODO Auto-generated constructor stub
    }

    abstract public void execute();
}
