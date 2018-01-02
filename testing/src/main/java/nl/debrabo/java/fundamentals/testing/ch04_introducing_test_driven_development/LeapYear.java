package nl.debrabo.java.fundamentals.testing.ch04_introducing_test_driven_development;

public class LeapYear {

    public static boolean isLeap(final int year) {
        return isDivisible(year, 4) && (!isDivisible(year, 100) || isDivisible(year, 400));
    }

    private static boolean isDivisible(int value, int denominator) {
        return value % denominator == 0;
    }

}
