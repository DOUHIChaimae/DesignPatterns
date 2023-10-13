package strategy;

import strategy.entities.Employe;
import strategy.services.IGRCalculator;
import strategy.services.impl.MarocIGRCalculator;

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