package teme.java_course1_intro;

import org.junit.Test;
import org.junit.runner.RunWith;
import teme.util.java_util.plugin.Grade;
import teme.util.java_util.plugin.GradeRunner;

import static org.junit.Assert.assertEquals;
import static teme.java_course1_intro.Ex4_EvenOddChecker.convertEvenOddToString;
import static teme.java_course1_intro.Ex4_EvenOddChecker.convertEvenOddToZeroOne;

/**
 * MAX GRADE: 8p
 */
@RunWith(GradeRunner.class)
public class Ex4EvenOddCheckerTest {

    @Test
    @Grade(2)
    public void testConvertEvenOddToNumber_forInvalidValue() {
        assertEquals(-1, convertEvenOddToZeroOne(0));
        assertEquals(-1, convertEvenOddToZeroOne(1001));
    }

    @Test
    @Grade(2)
    public void testConvertEvenOddToNumber_forValidValue() {
        assertEquals(1, convertEvenOddToZeroOne(1));
        assertEquals(1, convertEvenOddToZeroOne(17));
        assertEquals(0, convertEvenOddToZeroOne(200));
        assertEquals(0, convertEvenOddToZeroOne(1000));
    }

    @Test
    @Grade(2)
    public void testConvertEvenOddToString_forInvalidValue() {
        assertEquals("invalid", convertEvenOddToString(0));
        assertEquals("invalid", convertEvenOddToString(1001));
    }

    @Test
    @Grade(2)
    public void testConvertEvenOddToString_forValidValue() {
        assertEquals("odd", convertEvenOddToString(1));
        assertEquals("odd", convertEvenOddToString(17));
        assertEquals("even", convertEvenOddToString(200));
        assertEquals("even", convertEvenOddToString(1000));
    }
}
