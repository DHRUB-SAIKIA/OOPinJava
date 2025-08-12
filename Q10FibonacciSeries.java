//Q10.Fibonacci Series
//Write a method fibonacci(int terms) that prints the Fibonacci series up to the given number of terms.

public class Q10FibonacciSeries
{
    public static void fibonacci(int terms)
    {
        if (terms <= 0)
        {
            System.out.println("Number of terms must be positive.");
            return;
        }

        int first = 0, second = 1;

        for (int i = 1; i <= terms; i++)
        {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // new line after series
    }

    public static void main(String[] args) {
        fibonacci(10); // Output: 0 1 1 2 3 5 8 13 21 34
    }
}
