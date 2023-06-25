package teme.java_course2_flow;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import teme.util.java_util.plugin.Grade;
import teme.util.java_util.plugin.GradeRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static teme.java_course2_flow.Ex6_FilterArray.onlyOdd;

/**
 * MAX GRADE: 15p
 */
@RunWith(GradeRunner.class)
public class Ex6_FilterArrayTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10); // max running time allowed per each test method

    @Test
    @Grade(1)
    public void testFilterArray_emptyArray() {
        assertArrEquals(new int[]{}, onlyOdd(new int[]{}));
    }

    @Test
    @Grade(2)
    public void testFilterArray_elementZero() {
        assertArrEquals(new int[]{}, onlyOdd(new int[]{0}));
    }

    @Test
    @Grade(4)
    public void testFilterArray_allOdd() {
        assertArrEquals(new int[]{1}, onlyOdd(new int[]{1}));
        assertArrEquals(new int[]{1, 3}, onlyOdd(new int[]{1, 3}));
        assertArrEquals(new int[]{1, 3, 5, 7}, onlyOdd(new int[]{1, 3, 5, 7}));
    }

    @Test
    @Grade(4)
    public void testFilterArray_allEven() {
        assertArrEquals(new int[]{}, onlyOdd(new int[]{2}));
        assertArrEquals(new int[]{}, onlyOdd(new int[]{2, 4}));
        assertArrEquals(new int[]{}, onlyOdd(new int[]{2, 4, 8, 6}));
    }

    @Test
    @Grade(4)
    public void testFilterArray_someEven() {
        assertArrEquals(new int[]{1, 3}, onlyOdd(new int[]{1, 2, 3}));
        assertArrEquals(new int[]{3}, onlyOdd(new int[]{2, 3, 4}));
        assertArrEquals(new int[]{5, 3, 1, 3, 5}, onlyOdd(new int[]{6, 5, 4, 3, 2, 1, 2, 3, 4, 5}));
    }

    private void assertArrEquals(int[] expected, int[] actual) {
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}
