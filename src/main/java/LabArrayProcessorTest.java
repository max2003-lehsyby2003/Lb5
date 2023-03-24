import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class LabArrayProcessorTest {
    LabArrayProcessor labTest;
    @BeforeEach
    void setUp() {
        labTest = new LabArrayProcessor();
    }
    @Test
    void testFunction1() {
        double [] [] a ={{1, 2, 3},
                         {3, 2, 1},
                         {1, 1, 1}};
        double expected =12;
        double result = labTest.calculate (a);
        assertEquals(expected, result, 1.0e-5);
    }
    @Test
    void testFunction2() {
        double [] a ={1, 2, 3};
        double expected =6;
        double result = labTest.calculate (a);
        assertEquals(expected, result, 1.0e-5);
    }

}
