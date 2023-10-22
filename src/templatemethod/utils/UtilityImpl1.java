package templatemethod.utils;

public class UtilityImpl1 extends Utility {
    @Override
    public double filtre1(String str) {
        return Math.pow(str.length(), 4);
    }

    @Override
    public double filtre2(double number) {
        return number * 2;
    }
}
