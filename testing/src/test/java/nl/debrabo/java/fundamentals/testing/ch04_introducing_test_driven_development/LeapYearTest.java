package nl.debrabo.java.fundamentals.testing.ch04_introducing_test_driven_development;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeapYearTest {

    // a year is a leap year if it is divisible by four
    // but, years divisible by 100, are not leap years,
    // except years divisible by 400

    @Test
    public void leapYearsAreDivisibleByFour() {
        assertTrue(LeapYear.isLeap(2016));
    }

    @Test
    public void normalYearIsNotDivisibleByFour() {
        assertFalse(LeapYear.isLeap(3));
    }

    @Test
    public void yearsDivisibleBy100AreNotLeapYears() {
        assertFalse(LeapYear.isLeap(1900));
    }

    @Test
    public void yearsDivisibleBy400AreLeapYears() {
        assertTrue(LeapYear.isLeap(2000));
    }

}
