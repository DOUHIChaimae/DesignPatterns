package strategy.entities;

import strategy.services.IGRCalculator;
import strategy.utils.CalculUtils;
import strategy.utils.ValidationUtils;

public class Employe {
    private String cin;
    private float salaireBrutMensuel;
    private IGRCalculator igrCalculator;

    public Employe(String cin, float salaireBrutMensuel) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public float calculerIGR() {
        ValidationUtils.validateSalaireBrutMensuel(salaireBrutMensuel);
        var salaireBrutAnnuel = CalculUtils.getSalaireBrutAnnuel(salaireBrutMensuel);
        return igrCalculator.calculateIGR(salaireBrutAnnuel);
    }

    public float getSalaireNetMensuel() {
        float igr = calculerIGR();
        float salaireNetAnuel = salaireBrutMensuel * 12 - igr;
        return salaireNetAnuel / 12;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setIgrCalculator(IGRCalculator igrCalculator) {
        this.igrCalculator = igrCalculator;
    }
}
