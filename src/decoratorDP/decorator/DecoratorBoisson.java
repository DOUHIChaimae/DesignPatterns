package decoratorDP.decorator;

import decoratorDP.composants.Boisson;

public abstract class DecoratorBoisson extends Boisson {
    protected Boisson boisson;

    public DecoratorBoisson(Boisson boisson) {
        this.boisson = boisson;
    }
}
