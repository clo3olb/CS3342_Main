
interface AppFunction {
    public void execute();
}

abstract class OrganizerFunction implements AppFunction {
    abstract public void execute();
}

class CreateEvent extends OrganizerFunction {
    @Override
    public void execute() {
        // Prompt required information for creating an event.
        // Create Event
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
        function.execute();
    }

    public void test() {
        execute(new CreateEvent());
    }
}
