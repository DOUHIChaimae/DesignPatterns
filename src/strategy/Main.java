package strategy;

import strategy.entities.Employe;
import strategy.services.IGRCalculator;
import strategy.services.impl.MarocIGRCalculator;

public class Main {
    public static void main(String[] args) {
        IGRCalculator igrMarocCalculator = new MarocIGRCalculator();
        Employe employe = new Employe("emp1", 10000);
        employe.setIgrCalculator(igrMarocCalculator);
        float igr = employe.calculerIGR();
        employe.calculateSalaireNetMensuel(employe.getSalaireBrutMensuel(), igr);
    }
}