package zoo;

public class Lion implements Animal {
    private final String name;
    private final double weight;

    public Lion(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitLion(this);
    }
}