package strategy.services.impl;

import strategy.services.IGRService;

public class AlgerieIGRCalculator implements IGRService {


    @Override
    public float calculateIGR(float salaireBrutMensuel) {
        float salaireBrutAnnuel = getSalaireBrutAnnuel(salaireBrutMensuel);
        return salaireBrutAnnuel * 0.35f;
    }

    @Override
    public float getSalaireNetMensuel(float salaireBrutMensuel) {
        var igr = calculateIGR(salaireBrutMensuel);
        float salaireNetAnnuel = getSalaireBrutAnnuel(salaireBrutMensuel) - igr;
        return salaireNetAnnuel / 12;
    }


    private static float getSalaireBrutAnnuel(float salaireBrutMensuel) {
        float salaireBrutAnuel = salaireBrutMensuel * 12;
        return salaireBrutAnuel;
    }
}
