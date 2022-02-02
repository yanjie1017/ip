public abstract class Task {
    private String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String setDone(boolean isDone) {
        this.isDone = isDone;
        String feedback;
        if (this.isDone) {
            feedback = String.format("Nice! I've marked this task as done:\n%s", toString());
        } else {
            feedback = String.format("OK, I've marked this task as not done yet:\n%s", toString());
        }
        return feedback;
    }

    @Override
    public String toString() {
        String marking;
        if (isDone) {
            marking = "[X] ";
        } else {
            marking = "[ ] ";
        }
        return marking + description;
    }
}
