package model;

public class Task extends Event {
    private int priority;

    public Task(String title, String description, String deadline, int priority) {
        super(title, description, deadline);
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline='" + deadline + '\'' +
                ", priority=" + priority +
                '}';
    }
}
