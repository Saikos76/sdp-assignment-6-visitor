package zoo;

public class FeedingPlanVisitor implements AnimalVisitor {

    @Override
    public void visitLion(Lion lion) {
        double food = lion.getWeight() * 0.05;
        System.out.println(lion.getName() + " needs "
                + food + " kg of meat per day.");
    }

    @Override
    public void visitElephant(Elephant elephant) {
        double food = elephant.getWeight() * 0.04;
        System.out.println(elephant.getName() + " needs "
                + food + " kg of plants per day.");
    }
}