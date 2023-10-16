package model;

public class Reminder extends Event {
    private String time;

    public Reminder(String title, String description, String deadline, String time) {
        super(title, description, deadline);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reminder ( " +
                "title = '" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline='" + deadline + '\'' +
                ", time='" + time + '\''+")";
    }
}

