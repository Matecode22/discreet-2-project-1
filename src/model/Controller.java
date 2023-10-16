package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private CustomHashMap<Integer, Event> events;

    private CustomHashMap<Integer, Event> eventsBackup;
    private User user;

    private Integer countTask = 1;

    private Integer countTaskBackup = countTask;

    public Controller() {
        this.events = new CustomHashMap<>();
        this.eventsBackup = new CustomHashMap<>();
    }

    public void addTask(String title, String description, String deadline, int priority, int category) {
        countTaskBackup = countTask;
        eventsBackup = events.clone();
        Task task = new Task(title, description, deadline, priority, category);
        events.put(countTask, task);
        countTask++;
    }

    public void addReminder(String title, String description, String deadline, String time) {
        countTaskBackup = countTask;
        eventsBackup = events.clone();

        Reminder reminder = new Reminder(title, description, deadline, time);
        events.put(countTask, reminder);
        countTask++;
    }

    public Event getEvent(Integer title) {
        return events.get(title);
    }

    public boolean removeEvent(Integer title) {
        countTaskBackup = countTask;
        eventsBackup = events.clone();

        Event event = events.remove(title);
        return event != null;
    }

    public void showEvents() {
        System.out.println("-------- List of Events for --------");
        CustomLinkedList<Integer> keys = events.keySet();
        List<Task> tareas = new ArrayList<>();

        for (Integer key : keys) {
            Event event = events.get(key);
            if(event instanceof Task){
                Task task = (Task) event;
                task.setId(key);
                tareas.add(task);
            } else {
                System.out.println("ID: " + key + ", " + event);
            }
        }

        System.out.println("-------- List of Priority Task for --------");

        tareas.stream().filter(tarea -> tarea.getCategory() == 1).sorted(Comparator.comparingInt(Task::getPriority).reversed()).forEach(tarea -> {
            System.out.println("ID: " + tarea.getId() + ", " + tarea);
        });

        System.out.println("-------- List of No Priority Task for --------");

        tareas.stream().filter(tarea -> tarea.getCategory() == 2).sorted(Comparator.comparingInt(Task::getId)).forEach(tarea -> {
            System.out.println("ID: " + tarea.getId() + ", " + tarea);
        });
    }

    public void undo(){
        countTask = countTaskBackup;
        events = eventsBackup.clone();
    }

    public void modify(Integer id, Scanner scanner){
        eventsBackup = events.clone();

        Event event = events.get(id);

        if(event == null){
            System.out.println("task / Reminder no found ID: " + id);
            return;
        }

        if(event instanceof Task){
            scanner.nextLine();

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
            event.setTitle(title);
            event.setTitle(title);
            event.setDescription(description);
            event.setDeadline(deadline);
            ((Task) event).setPriority(priority);
            ((Task) event).setCategory(category);
            System.out.println("Task updated successfully!");
        } else {
            System.out.print("Enter reminder title: ");
            String title = scanner.nextLine();

            System.out.print("Enter reminder description: ");
            String description = scanner.nextLine();

            System.out.print("Enter reminder deadline: ");
            String deadline = scanner.nextLine();

            System.out.print("Enter reminder time: ");
            String time = scanner.nextLine();

            event.setTitle(title);
            event.setTitle(title);
            event.setDescription(description);
            event.setDeadline(deadline);
            ((Reminder) event).setTime(time);
            System.out.println("Reminder updated successfully!");
        }
    }
}
