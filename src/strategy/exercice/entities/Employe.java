package strategy.exercice.entities;

import strategy.exercice.services.IGRCalculator;
import strategy.exercice.utils.ValidationUtils;

import static strategy.exercice.utils.CalculUtils.calculateSalaireBrutAnnuel;

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
        var salaireBrutAnnuel = calculateSalaireBrutAnnuel(salaireBrutMensuel);
        return igrCalculator.calculateIGR(salaireBrutAnnuel);
    }

    public float calculateSalaireNetMensuel(float salaireBrutMensuel, float igr) {
        float salaireNetAnuel = calculateSalaireBrutAnnuel(salaireBrutMensuel) - igr;
        return salaireNetAnuel / 12;
    }

    public void setIgrCalculator(IGRCalculator igrCalculator) {
        this.igrCalculator = igrCalculator;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }
}
