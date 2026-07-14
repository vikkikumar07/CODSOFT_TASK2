package CODSOFT_TASK2;
import java.util.Scanner;
    
public class StudentGradeCalculator {
    final int OUT_OF_MARKS = 100;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==== STUDENT GRADE CALCULATOR ====");
        System.out.print("Enter the number of subjects: ");
        int subjects = input.nextInt();

        int totalMarks = 0;

        for(int i = 1; i<=subjects; i++) {
            System.out.print("Enter Marks of Subject "+i+" (0 - 100): ");
            int marks = input.nextInt();

            while(marks < 0 || marks > 100) {
                System.out.print("Invalid! Enter marks between 0 and 100: ");
                marks = input.nextInt();
            }

            totalMarks += marks;
        }
        
        double average = (double)totalMarks / subjects;

        String grade;
        if(average >= 90) {
            grade = "A+";
        } else if(average >= 80) {
            grade = "A";
        } else if(average >= 70) {
            grade = "B";
        } else if(average >= 60) {
            grade = "C";
        } else if(average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println();
        System.out.println(" ===== RESULT ===== ");
        System.out.println("Total Marks "+ totalMarks + " / "+ (subjects * 100));
        System.out.printf("Average Percentage : % 2f%% \n ", average);
        System.out.println("Grade : "+ grade);

        input.close();
    }
    
}
