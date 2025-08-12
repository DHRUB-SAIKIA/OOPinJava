//Q8.Prime Number Check
//Write a method isPrime(int n) that checks if a number is prime or not.

public class Q8PrimeNumberCheck
{
    public static boolean isPrime(int n)
    {
        if (n <= 1) return false; // 0, 1, and negatives are not prime
        if (n == 2) return true;  // 2 is the only even prime
        if (n % 2 == 0) return false; // even numbers greater than 2 are not prime

        // Check odd divisors up to √n
        for (int i = 3; i * i <= n; i += 2)
        {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(isPrime(2));   // true
        System.out.println(isPrime(15));  // false
        System.out.println(isPrime(17));  // true
    }
}
