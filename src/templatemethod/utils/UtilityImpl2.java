package templatemethod.utils;

public class UtilityImpl2 extends Utility {
    @Override
    public double filtre1(String str) {
        return Math.pow(str.length(), 2);
    }

    @Override
    public double filtre2(double number) {
        return number * 19;
    }
}
