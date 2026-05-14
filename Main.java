import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Scheduler scheduler = new Scheduler();

        AuthService authService = new AuthService();

        while (true) {

            System.out.println("\n===== SCHEDULO LOGIN SYSTEM =====");

            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Enter Choice : ");

            int authChoice =
                    Integer.parseInt(scanner.nextLine());

            switch (authChoice) {

                case 1:

                    authService.register(scanner);

                    break;

                case 2:

                    boolean loggedIn =
                            authService.login(scanner);

                    if (loggedIn) {

                        scheduler.start(scanner);
                    }

                    break;

                case 3:

                    System.out.println("Exiting Application.");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}
