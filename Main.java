public class Main {
    static void main() {
        System.out.println("Yello");
        Auth.Server.getInstance().authenticate("email", "password");
    }
}