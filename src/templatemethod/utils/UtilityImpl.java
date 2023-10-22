package templatemethod.utils;

import templatemethod.utils.Utility;

public class UtilityImpl extends Utility {
    @Override
    public double filtre1(String str) {
        return Math.pow(str.length(), 4);
    }

    @Override
    public double filtre2(double number) {
        return number * 2;
    }
}
