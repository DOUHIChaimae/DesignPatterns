package td1.exercice1.composite;

public class Cercle extends Figure {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return Math.PI * Math.pow(rayon, 2);
    }
}
