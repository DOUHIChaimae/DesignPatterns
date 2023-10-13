package strategy;

import strategy.entities.Employe;
import strategy.services.IGRService;
import strategy.services.impl.MarocIGRCalculator;

public class Main {
    public static void main(String[] args) {
        Employe employe = new Employe("emp1", 10000);
        IGRService igrMarocService = new MarocIGRCalculator();
        igrMarocService.calculateIGR(employe.getSalaireBrutMensuel());
        igrMarocService.getSalaireNetMensuel(employe.getSalaireBrutMensuel());

    }
}