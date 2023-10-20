package td1.exercice1.composite;

import java.util.ArrayList;
import java.util.List;

public class GroupFigure extends Figure {
    public List<Figure> figures = new ArrayList<>();

    public void addFigure(Figure figure) {
        figures.add(figure);
    }


    @Override
    public double calculerAire() {
        double airTotale = 0;
        for (Figure figure : figures) {
            airTotale += figure.calculerAire();
        }
        return airTotale;
    }
}
