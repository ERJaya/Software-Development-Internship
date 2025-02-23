import java.util.ArrayList;
import java.util.Scanner;

// Task class to represent each task
class Task {
    private String title;
    private String description;

    // Constructor to initialize task
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Description: " + description;
    }
}

// Main application class
class TaskManager{

    private static ArrayList<Task> tasks = new ArrayList<>();  // List to store tasks
    private static Scanner scanner = new Scanner(System.in);

    // Create a new task
    public static void createTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        Task task = new Task(title, description);
        tasks.add(task);
        System.out.println("Task created successfully!\n");
    }

    // Read and display all tasks
    public static void readTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.\n");
        } else {
            System.out.println("Tasks List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
            System.out.println();
        }
    }

    // Update an existing task
    public static void updateTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to update.\n");
            return;
        }

        System.out.print("Enter task number to update: ");
        int taskNumber = Integer.parseInt(scanner.nextLine()) - 1;
        if (taskNumber >= 0 && taskNumber < tasks.size()) {
            Task task = tasks.get(taskNumber);
            System.out.print("Enter new title: ");
            String newTitle = scanner.nextLine();
            System.out.print("Enter new description: ");
            String newDescription = scanner.nextLine();
            task.setTitle(newTitle);
            task.setDescription(newDescription);
            System.out.println("Task updated successfully!\n");
        } else {
            System.out.println("Invalid task number!\n");
        }
    }

    // Delete a task
    public static void deleteTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to delete.\n");
            return;
        }

        System.out.print("Enter task number to delete: ");
        int taskNumber = Integer.parseInt(scanner.nextLine()) - 1;
        if (taskNumber >= 0 && taskNumber < tasks.size()) {
            tasks.remove(taskNumber);
            System.out.println("Task deleted successfully!\n");
        } else {
            System.out.println("Invalid task number!\n");
        }
    }

    // Main menu
    public static void showMenu() {
        System.out.println("Task Manager Menu:");
        System.out.println("1. Create Task");
        System.out.println("2. Read Tasks");
        System.out.println("3. Update Task");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    // Main method
    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    createTask();
                    break;
                case 2:
                    readTasks();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.\n");
            }
        }
    }
}
