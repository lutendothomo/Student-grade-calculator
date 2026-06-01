package calculator;

public class GradeCalculator {
    public double studentAverage(double[] grades) {
        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("Grades array is empty");
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public double classMean(double[][] allGrades) {
        if (allGrades == null || allGrades.length == 0) {
            throw new IllegalArgumentException("Grades array is empty");
        }
        double total = 0;
        for (double[] grade : allGrades) {
            total += studentAverage(grade);
        }
        return total / allGrades.length;


    }

    public double highestAverage(double[][] allGrades) {
        if (allGrades == null || allGrades.length == 0) {
            throw new IllegalArgumentException("Class grades cannot be empty");
        }
        double highest = Double.MIN_VALUE;
        for (double[] studentGrades : allGrades) {
            double avg = studentAverage(studentGrades);
            if (avg > highest) {
                highest = avg;
            }
        }


        return highest;
    }
}
