//Q1.Sum of Two Numbers
//Write a Java program with a function sum(int a, int b) that returns the sum of two numbers entered by the user.

import java.util.Scanner;
public class Q1SumOfTwoNumbersWithFunction
{
    // Function to return sum of two integers
    public static int sum(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt user for second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Call sum function and store result
        int result = sum(num1, num2);

        // Display the result
        System.out.println("The sum is: " + result);

        scanner.close();
    }
}