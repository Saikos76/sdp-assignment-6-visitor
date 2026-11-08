package zoo;

public interface Animal {
    void accept(AnimalVisitor visitor);
}