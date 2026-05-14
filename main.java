import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Scheduler scheduler = new Scheduler();

        while (true) {

            TaskManager.displayHeader();

            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Search Task");
            System.out.println("4. Update Task");
            System.out.println("5. Delete Task");
            System.out.println("6. Mark Task as Completed");
            System.out.println("7. View Completed Tasks");
            System.out.println("8. View Pending Tasks");
            System.out.println("9. Exit");

            System.out.print("\nEnter your choice: ");

            int choice;

            try {

                choice = Integer.parseInt(scanner.nextLine());

            } catch (Exception e) {

                System.out.println("Invalid input.");
                continue;
            }

            switch (choice) {

                case 1:

                    System.out.print("\nEnter Task Title        : ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Task Description  : ");
                    String description = scanner.nextLine();

                    System.out.print("Enter Task Priority (High/Medium/Low): ");
                    String priority = scanner.nextLine();

                    System.out.print("Enter Due Date (DD-MM-YYYY): ");
                    String dueDate = scanner.nextLine();

                    System.out.print("Enter Task Time : ");
                    String time = scanner.nextLine();

                    scheduler.addTask(
                            title,
                            description,
                            priority,
                            dueDate,
                            time
                    );

                    break;

                case 2:

                    scheduler.viewTasks();

                    break;

                case 3:

                    System.out.print("\nEnter keyword to search: ");
                    String keyword = scanner.nextLine();

                    scheduler.searchTask(keyword);

                    break;

                case 4:

                    scheduler.viewTasks();

                    System.out.print("\nEnter Task ID to update: ");
                    int updateId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter New Title       : ");
                    String newTitle = scanner.nextLine();

                    System.out.print("Enter New Description : ");
                    String newDesc = scanner.nextLine();

                    System.out.print("Enter New Priority    : ");
                    String newPriority = scanner.nextLine();

                    System.out.print("Enter New Due Date    : ");
                    String newDate = scanner.nextLine();

                    System.out.print("Enter New Time        : ");
                    String newTime = scanner.nextLine();

                    scheduler.updateTask(
                            updateId,
                            newTitle,
                            newDesc,
                            newPriority,
                            newDate,
                            newTime
                    );

                    break;

                case 5:

                    scheduler.viewTasks();

                    System.out.print("\nEnter Task ID to delete: ");

                    int deleteId = Integer.parseInt(scanner.nextLine());

                    scheduler.deleteTask(deleteId);

                    break;

                case 6:

                    scheduler.viewTasks();

                    System.out.print("\nEnter Task ID to mark completed: ");

                    int completeId = Integer.parseInt(scanner.nextLine());

                    scheduler.completeTask(completeId);

                    break;

                case 7:

                    scheduler.viewCompletedTasks();

                    break;

                case 8:

                    scheduler.viewPendingTasks();

                    break;

                case 9:

                    TaskManager.exitMessage();

                    System.exit(0);

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}
