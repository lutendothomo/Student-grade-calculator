package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {

    private GradeCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new GradeCalculator();
    }

    @Test
    void studentAverage_shouldReturnCorrectAverage() {
        double[] grades = {80, 90, 70, 100};
        double result = calculator.studentAverage(grades);
        assertEquals(85.0, result, 0.001);
    }

    @Test
    void studentAverage_singleGrade_shouldReturnThatGrade() {
        double[] grades = {75};
        assertEquals(75.0, calculator.studentAverage(grades), 0.001);
    }

    @Test
    void studentAverage_shouldThrowWhenEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.studentAverage(new double[]{});
        });
    }

    @Test
    void classMean_shouldReturnAverageOfAllStudents() {
        double[][] classGrades = {
                {80, 90},
                {60, 80},
                {70, 90}
        };
        assertEquals(78.333, calculator.classMean(classGrades), 0.001);
    }

    @Test
    void highestAverage_shouldReturnTopStudentAverage() {
        double[][] classGrades = {
                {60, 70},
                {90, 100},
                {80, 80}
        };
        assertEquals(95.0, calculator.highestAverage(classGrades), 0.001);
    }
}