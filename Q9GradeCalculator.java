//Q9.Grade Calculation
//Create a method calculateGrade(int marks) that returns the grade (A, B, C, etc.) based on marks.

public class Q9GradeCalculator
{
    public static char calculateGrade(int marks)
    {
        if (marks < 0 || marks > 100)
        {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }

        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else if (marks >= 50) return 'E';
        else return 'F';
    }

    public static void main(String[] args)
    {
        System.out.println(calculateGrade(95)); // A
        System.out.println(calculateGrade(76)); // C
        System.out.println(calculateGrade(42)); // F
    }
}
