package templatemethod.utils;

public abstract class Utility {

    //Squelette d'algos
    public double compute(String str) {
        int size = str.length();
        double result = 0;
        for (int i = 0; i < size; i++) {
            double x = filtre1(str);
            result += i * x;
            double y = filtre2(result);
            result += y * result;
        }
        return result;
    }


    public abstract double filtre1(String str);

    public abstract double filtre2(double number);
}
