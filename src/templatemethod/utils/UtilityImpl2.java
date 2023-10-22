package templatemethod.utils;

public class UtilityImpl2 extends Utility {
    @Override
    protected double filtre1(String str) {
        return Math.pow(str.length(), 2);
    }

    @Override
    protected double filtre2(double number) {
        return number * 19;
    }
}
