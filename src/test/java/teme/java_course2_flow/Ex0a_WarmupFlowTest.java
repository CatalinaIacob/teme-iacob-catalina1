package teme.java_course2_flow;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import teme.util.java_util.plugin.Grade;
import teme.util.java_util.plugin.GradeRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static teme.java_course2_flow.Ex0a_WarmupFlow.*;
import static teme.util.java_util.TestUtil.runCapturingOutput;

/**
 * MAX GRADE: 12p
 */
@RunWith(GradeRunner.class)
public class Ex0a_WarmupFlowTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10); // max running time allowed per each test method


    @Test
    @Grade(2)
    public void testWhichIsBigger() {
        String out = runCapturingOutput(() -> whichIsBigger(-2, -3)).toLowerCase();
        assertTrue(out.contains("first") && !out.contains("second") && !out.contains("equal"));

        out = runCapturingOutput(() -> whichIsBigger(2, 9)).toLowerCase();
        assertTrue(!out.contains("first") && out.contains("second") && !out.contains("equal"));

        out = runCapturingOutput(() -> whichIsBigger(4, 4)).toLowerCase();
        assertTrue(!out.contains("first") && !out.contains("second") && out.contains("equal"));
    }

    @Test
    @Grade(2)
    public void testMax() {
        assertEquals(3, max(1, 2, 3), 0.1);
        assertEquals(3, max(1, 3, 2), 0.1);
        assertEquals(3, max(3, 1, 2), 0.1);
        assertEquals(3, max(3, 3, 1), 0.1);
        assertEquals(3, max(1, 3, 3), 0.1);
        assertEquals(3, max(3, 1, 3), 0.1);
        assertEquals(3, max(3, 3, 3), 0.1);
    }

    @Test
    @Grade(1)
    public void testXTimes() {
        assertEquals("", xTimes("", 0));
        assertEquals("", xTimes("abc", 0));
        assertEquals("abcabc", xTimes("abc", 2));
        assertEquals("AAA", xTimes("A", 3));
    }

    @Test
    @Grade(2)
    public void testSumSquares() {
        assertEquals(0, sumSquares(0));
        assertEquals(1, sumSquares(1));
        assertEquals(5, sumSquares(2));
        assertEquals(385, sumSquares(10));
    }


    @Test
    @Grade(1)
    public void testFactorial_valuesUpTo12_usingIntTypeIsEnough() {
        assertEquals(1, factorial(1));
        assertEquals(2, factorial(2));
        assertEquals(120, factorial(5));
        assertEquals(3628800, factorial(10));
        assertEquals(479001600, factorial(12));
    }

    @Test
    @Grade(1)
    public void testFactorial_valuesUpTo_16_requireUseOfLongType() {
        assertEquals(6227020800L, factorial(13));
        assertEquals(87178291200L, factorial(14));
        assertEquals(20922789888000L, factorial(16)); //about the max value that still fits in the range for long!
    }

    @Test
    @Grade(1)
    public void testDayOfWeek_invalidValues() {
        assertEquals(-1, dayOfWeek("altceva"));
        assertEquals(-1, dayOfWeek(""));
    }

    @Test
    @Grade(1)
    public void testDayOfWeek_lowerCaseOnly() {
        assertEquals(1, dayOfWeek("luni"));
        assertEquals(2, dayOfWeek("marti"));
        assertEquals(3, dayOfWeek("miercuri"));
        assertEquals(4, dayOfWeek("joi"));
        assertEquals(5, dayOfWeek("vineri"));
        assertEquals(6, dayOfWeek("sambata"));
        assertEquals(7, dayOfWeek("duminica"));
    }

    @Test
    @Grade(1)
    public void testDayOfWeek_mixedCase() {
        assertEquals(1, dayOfWeek("LUNI"));
        assertEquals(2, dayOfWeek("Marti"));
        assertEquals(3, dayOfWeek("MiERCURi"));
        assertEquals(4, dayOfWeek("jOi"));
        assertEquals(5, dayOfWeek("VinerI"));
        assertEquals(6, dayOfWeek("SaMbAtA"));
        assertEquals(7, dayOfWeek("Duminica"));
    }
}
