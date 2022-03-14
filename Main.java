public class Main {
    static void main() {
        System.out.println("Yello");
        AuthManager.getInstance().authenticate("email", "password");
    }
}