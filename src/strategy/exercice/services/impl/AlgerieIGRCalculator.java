package strategy.exercice.services.impl;

import strategy.exercice.services.IGRCalculator;

public class AlgerieIGRCalculator implements IGRCalculator {

    @Override
    public float calculateIGR(float salaireBrutAnuel) {
        return salaireBrutAnuel * 0.35f;
    }
}
