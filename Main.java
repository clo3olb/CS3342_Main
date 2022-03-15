public class Main {
    static void main() {
        System.out.println("Yello");
        AuthService.getInstance().authenticate("email", "password");
    }
}