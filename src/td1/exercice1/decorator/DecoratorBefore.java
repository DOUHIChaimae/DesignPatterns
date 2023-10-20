package td1.exercice1.decorator;

public class DecoratorBefore extends Decorator {
    public DecoratorBefore(Component component) {
        super(component);
    }

    @Override
    public void traitement() {
        System.out.println("Additional behavior before the processing");
        super.traitement();
    }
}
