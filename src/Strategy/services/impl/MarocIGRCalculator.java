package Strategy.services.impl;


import Strategy.services.IGRService;

public class MarocIGRCalculator implements IGRService {
    @Override
    public float calculateIGR(float salaireBrutMensuel) {
        float salaireBrutAnnuel = getSalaireBrutAnnuel(salaireBrutMensuel);
        if (salaireBrutAnnuel < 40000) {
            return salaireBrutMensuel * 0.05f;
        } else if (salaireBrutAnnuel > 40000 && salaireBrutAnnuel < 120000)
            return salaireBrutMensuel * 0.02f;
        else return salaireBrutMensuel * 0.04f;
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
