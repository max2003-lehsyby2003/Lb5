import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

class LabDoubleArrayReaderTest {
    LabDoubleArrayReader labDoubleArrayReader;
    @BeforeEach
    void setUp() {
        labDoubleArrayReader = new LabDoubleArrayReader();
    }

    @Test
    void testReadOneDimensionalArray() {
        File file = new File("File_Test.txt");
        double[] result = labDoubleArrayReader.readOneDimensionalArray(file);
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0};
        assertArrayEquals(expected, result, 1.e-2);
    }

    @Test
    void testReadOneDimensionalArray2() {
        File file = new File("File_Test.txt");
        double[] result = labDoubleArrayReader.readOneDimensionalArray(file);
        int expected =5;
        assertEquals(expected, result.length, 1.e-2);
    }

    @Test
    void readTwoDimensionalArray() {
    }

    @Test
    void testReadTwoDimensionalArray() {
    }
}