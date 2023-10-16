package model;

public class Controller {
    private CustomHashMap<String, Event> events;
    private User user;

    public Controller() {
        this.events = new CustomHashMap<>();
    }

    public void addTask(String title, String description, String deadline, int priority) {
        Task task = new Task(title, description, deadline, priority);
        events.put(title, task);
    }

    public void addReminder(String title, String description, String deadline, String time) {
        Reminder reminder = new Reminder(title, description, deadline, time);
        events.put(title, reminder);
    }

    public Event getEvent(String title) {
        return events.get(title);
    }

    public boolean removeEvent(String title) {
        Event event = events.remove(title);
        return event != null;
    }

    public void showEvents() {
        System.out.println("-------- List of Events for " + user.getName() + " --------");
        CustomLinkedList<String> keys = events.keySet();
        for (String key : keys) {
            Event event = events.get(key);
            System.out.println("ID: " + key + ", " + event);
        }
    }
}