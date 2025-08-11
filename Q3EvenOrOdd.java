//Q3. Even or Odd
//Write a method isEven(int num) that returns true if the number is even, otherwise false.

public class Q3EvenOrOdd
{
    public static boolean isEven(int num)
    {
        return num % 2 == 0;
    }

    public static void main(String[] args)
    {
        System.out.println(isEven(4));
        System.out.println(isEven(7));
    }
}
