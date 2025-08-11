//Q2.Factorial Calculation
//Create a method factorial(int n) that returns the factorial of a number entered by the user.

public class Q2FactorialCalculation
{
    // Method to calculate factorial
    public static long factorial(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        try {
            System.out.println("Factorial of " + num + " is: " + factorial(num));
        } catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
