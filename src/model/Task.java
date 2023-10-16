package model;

public class Task extends Event {
    private int priority;


    private int category;

    private int id;

    public Task(String title, String description, String deadline, int priority, int category) {
        super(title, description, deadline);
        this.priority = priority;
        this.category = category;
    }

    public int getPriority() {
        return priority;
    }


    public int getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Task (" +
                "title ='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline='" + deadline + '\'' +
                ", category='" + category + '\'' +
                ", priority=" + priority+" ) ";

    }
}
