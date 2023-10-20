package td1.exercice1.decorator;

public class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void traitement() {
        component.traitement();
    }
}
