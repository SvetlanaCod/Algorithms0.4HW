import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AscendingSequenceTest {
    @Test
    public void testAscendingSequenceHappyPathPositive() {
        //0,1,2,3,4,5,
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceHappyPathNegativeNumber() {
        //-10,-9,-8,-7
        int start = -10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceHappyPathNegativePositiveNumber() {
        int start = -5;
        int end = -5;
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepTwo() {
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStartLargerThenEnd() {
        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceNegativeStep() {
        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepIsZero() {
        int start = 5;
        int end = 0;
        int step = 0;
        int[] expectedResult = {-10, -9, -8, -7};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
