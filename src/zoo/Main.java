package zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimal(new Lion("Simba", 190));
        zoo.addAnimal(new Elephant("Dumbo", 3000));

        System.out.println("=== HEALTH CHECK ===");
        zoo.performOperation(new HealthCheckVisitor());

        System.out.println("\n=== FEEDING PLAN ===");
        zoo.performOperation(new FeedingPlanVisitor());
    }
}