import java.util.ArrayList;
import java.util.Scanner;

public class AuthService {

    private ArrayList<User> users = new ArrayList<>();

    public void register(Scanner scanner) {

        System.out.print("Enter Username : ");
        String username = scanner.nextLine();

        System.out.print("Enter Password : ");
        String password = scanner.nextLine();

        users.add(new User(username, password));

        System.out.println("Registration Successful!");
    }

    public boolean login(Scanner scanner) {

        System.out.print("Enter Username : ");
        String username = scanner.nextLine();

        System.out.print("Enter Password : ");
        String password = scanner.nextLine();

        for (User user : users) {

            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {

                System.out.println("Login Successful!");

                return true;
            }
        }

        System.out.println("Invalid Credentials.");

        return false;
    }
}
