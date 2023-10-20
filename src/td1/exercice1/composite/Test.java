package td1.exercice1.composite;

public class Test {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(3.0);
        Rectangle rectangle = new Rectangle(2.0, 5.0);

        GroupFigure groupFigure = new GroupFigure();
        groupFigure.addFigure(cercle);
        groupFigure.addFigure(rectangle);
        System.out.print("Aire du cercle" + cercle.calculerAire());
        System.out.print("Aire du rectangle" + cercle.calculerAire());
        System.out.print("Aire total" + groupFigure.calculerAire());
    }
}
