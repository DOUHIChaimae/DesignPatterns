package td1.exercice1.templatemethod;

public class TemplateImpl1 extends TemplateClass {
    @Override
    public double step1(int a, int b) {
        return a * b + Math.pow(a, b);
    }

    @Override
    public double step2(int a, int b) {
        return Math.max(a, b);
    }
}
