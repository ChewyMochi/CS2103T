public class Todo extends Task {
    protected boolean isDone;

    public Todo(String description) {
        super(description);
        this.isDone = false;
    }

    public boolean isDone() {
        return this.isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public String getDescription() {
        return super.getDescription();
    }
}
