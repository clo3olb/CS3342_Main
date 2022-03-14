import java.util.ArrayList;

class Register implements AppFunction {

    @Override
    public boolean authenticate() {
        auth.isBanned();
        return auth.isAdministrator();
    }

    @Override
    public void execute() {
        authenticate();

    }
}

interface AppFunction {
    public boolean authenticate(Auth auth);

    public void execute();
}

public class App {
    private User user;
    private ArrayList<AppFunction> functions = new ArrayList<AppFunction>();

    public ArrayList<AppFunction> listFunctions () {
    if user.type   == OrganizerType 
        filter(ArrayList<AppFunction>);
}
}
