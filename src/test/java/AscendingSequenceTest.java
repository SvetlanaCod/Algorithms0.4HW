import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AscendingSequenceTest {
    AscendingSequence as;

    @BeforeEach
    void setUP() {
        as = new AscendingSequence();
    }
    @Order(1)
    @RepeatedTest(10)
    @Test
    public void testAscendingSequenceHappyPath() {
        //0,1,2,3,4,5
        int start = 0;                           //ААА -
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
        // В TestNG сначала идет actualResult,потом expectedResult, а в JUNIT сначала expectedResult,
        // а потом actualResult
    }
   @Order(2)
   @Test
   public void testAscendingSequenceHappyPathNegativeNumber() {
       //-10,-9,-8,-7
       int start = -10;
       int end = -7;
       int step = 1;
       int[] expectedResult = {-10, -9, -8, -7};

       AscendingSequence as = new AscendingSequence();
       int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

       Assertions.assertArrayEquals(expectedResult,actualResult);
   }

   @Order(3)
    @Test
    public void testAscendingSequenceHappyPathNegativePositiveNumber() {
        //-5,-4,-3,-2,-1,0,1,2,3,4,5
        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5,-4,-3,-2,-1,0,1,2,3,4,5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals (expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testAscendingSequenceHappyPathStepTwo() {
        //0,2,4,
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4,};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals (expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceStartLargerThenEnd() {
        //0,2,4,
        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals (expectedResult, actualResult);

    }
    @Test
    public void testAscendingSequenceNegativeStep() {
        //0,2,4,
        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals (expectedResult, actualResult);

    }
    @Test
    public void testAscendingSequenceStepIsZero() {

        int start = 5;
        int end = 0;
        int step = 0;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals (expectedResult, actualResult);

    }


}
