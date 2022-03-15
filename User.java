<<<<<<< HEAD
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
        return AuthManager.getInstance().authenticate(email, password);
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
    abstract public void execute();
=======
public class User {
    //just a dummy class
>>>>>>> 299539ca5acd18eef82e918a144e7f4d54131a58
}
