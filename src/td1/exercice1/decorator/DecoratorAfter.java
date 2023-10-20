package td1.exercice1.decorator;

public class DecoratorAfter extends Decorator {
    public DecoratorAfter(Component component) {
        super(component);
    }

    @Override
    public void traitement() {
        super.traitement();
        System.out.println("Additional behavior after the processing");
    }
}
