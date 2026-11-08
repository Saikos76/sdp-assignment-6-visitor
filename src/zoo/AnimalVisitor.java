package zoo;

public interface AnimalVisitor {
    void visitLion(Lion lion);
    void visitElephant(Elephant elephant);
}