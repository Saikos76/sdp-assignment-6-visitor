package zoo;

public class HealthCheckVisitor implements AnimalVisitor {

    @Override
    public void visitLion(Lion lion) {
        System.out.println("Health check for lion " + lion.getName()
                + ": healthy. Weight: " + lion.getWeight() + " kg.");
    }

    @Override
    public void visitElephant(Elephant elephant) {
        System.out.println("Health check for elephant " + elephant.getName()
                + ": healthy. Weight: " + elephant.getWeight() + " kg.");
    }
}