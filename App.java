
interface AppFunction {
    public boolean authenticate(Auth auth);

    public void execute();
}

abstract class OrganizerFunction implements AppFunction {
    public boolean authenticate(Auth auth) {
        // Checks whether the auth is OrganizerAuth.
        return auth instanceof OrganizerAuth;
    }

    abstract public void execute();
}

class CreateEvent extends OrganizerFunction {
    @Override
    public void execute() {
        // Prompt required information for creating an event.
        // Create Event
    }
}

abstract class AdministratorFunction implements AppFunction {
    public boolean authenticate(Auth auth) {
        // Checks whether the auth is AdministratorAuth.
        return auth instanceof AdministratorAuth;
    }

    @Override
    abstract public void execute();
}

class BanEvent extends AdministratorFunction {
    @Override
    public void execute() {
        // Ban an event that is not appropriate to display.
    }
}

public class App {
    private Auth auth;

    App() {
        // null auth indicates "Not signed in"
        this.auth = null;
    }

    public void login(String email, String password) {
        this.auth = Auth.get(email, password);
    }

    public void execute(AppFunction function) {
        if (function.authenticate(this.auth)) {
            function.execute();
        }
    }
}
