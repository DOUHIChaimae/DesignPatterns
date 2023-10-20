package td1.exercice1.decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ComponentImpl();
        component = new DecoratorBefore(new DecoratorAfter(component));
        component.traitement();
    }
}
