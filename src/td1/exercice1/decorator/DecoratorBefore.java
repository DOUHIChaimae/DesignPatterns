package td1.exercice1.decorator;

public class DecoratorBefore extends Decorator {
    public DecoratorBefore(Composant composant) {
        super(composant);
    }

    @Override
    public void traitement() {
        System.out.println("Comportement supplementaire avant le traitement");
        super.traitement();
    }
}
