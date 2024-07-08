package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Main method for user interaction
    public static void main(String[] args) {
        Tasks taskManager = new Tasks();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new task");
            System.out.println("2. Remove a task");
            System.out.println("3. Mark a task as completed");
            System.out.println("4. Show completed tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String newTask = scanner.nextLine();
                    taskManager.addTask(newTask);
                    break;
                case 2:
                    System.out.print("Enter task to remove: ");
                    String removeTask = scanner.nextLine();
                    taskManager.removeTask(removeTask);
                    break;
                case 3:
                    System.out.print("Enter task to mark as completed: ");
                    String completedTask = scanner.nextLine();
                    taskManager.markTaskAsCompleted(completedTask);
                    break;
                case 4:
                    taskManager.showCompletedTasks();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}