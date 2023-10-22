package templatemethod;

import templatemethod.utils.Utility;
import templatemethod.utils.UtilityImpl1;
import templatemethod.utils.UtilityImpl2;

public class Test {
    public static void main(String[] args) {
        Utility utility1 = new UtilityImpl1();
        System.out.println(utility1.compute("douhi"));
        utility1 = new UtilityImpl2();
        System.out.println(utility1.compute("douhi"));
    }
}
