package strategy;


import strategy.exercice.entities.Employe;
import strategy.exercice.services.IGRCalculator;
import strategy.exercice.services.impl.MarocIGRCalculator;

public class Test {
    public static void main(String[] args) {
        IGRCalculator igrMarocCalculator = new MarocIGRCalculator();
        Employe employe = new Employe("emp1", 10000);
        employe.setIgrCalculator(igrMarocCalculator);
        float igr = employe.calculerIGR();
        System.out.println(igr);
        System.out.println(employe.calculateSalaireNetMensuel(employe.getSalaireBrutMensuel(), igr));
    }
}