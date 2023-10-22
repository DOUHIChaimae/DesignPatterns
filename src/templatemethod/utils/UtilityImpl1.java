package templatemethod.utils;

public class UtilityImpl1 extends Utility {
    @Override
    protected double filtre1(String str) {
        return Math.pow(str.length(), 4);
    }

    @Override
    protected double filtre2(double number) {
        return number * 2;
    }
}
