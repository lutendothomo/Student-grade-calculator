package calculator;

public class Main {
    public static void main(String[] args) {

        GradeCalculator calculator = new GradeCalculator();


        double[] student1 = {85, 90, 78, 92};
        double[] student2 = {70, 65, 80, 75};
        double[] student3 = {95, 88, 92, 97};


        System.out.println("Student Averages");
        System.out.println("Student 1 average: " + calculator.studentAverage(student1));
        System.out.println("Student 2 average: " + calculator.studentAverage(student2));
        System.out.println("Student 3 average: " + calculator.studentAverage(student3));


        double[][] classGrades = {student1, student2, student3};


        System.out.println("\nClass Statistics");
        System.out.println("Class mean:       " +String.format("%.2f", calculator.classMean(classGrades)));

        System.out.println("Highest average:  " + calculator.highestAverage(classGrades));
    }
}