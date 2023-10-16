package ui;

import model.Controller;

import java.util.Scanner;

public class Main {

    private Scanner scanner;
    private Controller controller;

    public Main() {
        scanner = new Scanner(System.in);
        controller = new Controller();
    }

    public static void main(String[] args){
        Main m = new Main();
        m.start();
    }

    private void start() {
        int choice;

        do {
            System.out.println("-------- Task and Reminder Management System --------");
            System.out.println("1. Add Task");
            System.out.println("2. Add Reminder");
            System.out.println("3. Show Events");
            System.out.println("4. Remove Event");
            System.out.println("5. Modify Task / Reminder");
            System.out.println("6. Undo");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    addReminder();
                    break;
                case 3:
                    showEvents();
                    break;
                case 4:
                    removeEvent();
                    break;
                case 5:
                    modify();
                    break;
                case 6:
                    controller.undo();
                    break;
                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 7);
        scanner.close();
    }

    private void addTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();

        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        System.out.print("Enter task deadline: ");
        String deadline = scanner.nextLine();

        System.out.print("Enter task priority: ");
        int priority = scanner.nextInt();

        System.out.print("Enter task category (1. Prioritaria, 2. No Prioritaria): ");
        int category = scanner.nextInt();
        scanner.nextLine();

        controller.addTask(title, description, deadline, priority, category);
        System.out.println("Task added successfully!");
    }

    private void modify(){
        System.out.print("Enter task / Reminder ID: ");
        Integer id = scanner.nextInt();

        controller.modify(id, scanner);
    }


    private void addReminder() {
        System.out.print("Enter reminder title: ");
        String title = scanner.nextLine();

        System.out.print("Enter reminder description: ");
        String description = scanner.nextLine();

        System.out.print("Enter reminder deadline: ");
        String deadline = scanner.nextLine();

        System.out.print("Enter reminder time: ");
        String time = scanner.nextLine();

        controller.addReminder(title, description, deadline, time);
        System.out.println("Reminder added successfully!");
    }

    private void showEvents() {
        System.out.println("-------- List of Events --------");
        controller.showEvents();
    }

    private void removeEvent() {
        System.out.print("Enter the ID of the event to remove: ");
        Integer eventId = scanner.nextInt();
        if (controller.removeEvent(eventId)) {
            System.out.println("Event removed successfully!");
        } else {
            System.out.println("No event found with ID " + eventId);
        }
    }
}
