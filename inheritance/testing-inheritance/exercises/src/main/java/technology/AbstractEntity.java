package technology;

public abstract class AbstractEntity {
    private static int nextId = 1;
    private final int id;

    public AbstractEntity() {
        this.id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public abstract String describe();
}
