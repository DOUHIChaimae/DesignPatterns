package td1.exercice1.templatemethod;

/**
 * Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass
 * but lets subclasses override specific steps of the algorithm without changing its structure.
 */

public abstract class TemplateClass {
    public double getSum(int a, int b) {
        double comp = 0;
        double v1 = step1(a, b);
        double v2 = step2(a, b);
        comp++;
        return comp * (v1 + v2);
    }

    protected abstract double step1(int a, int b);

    protected abstract double step2(int a, int b);

}
