import java.util.Scanner;

class Calculator
{
    int add(int a, int b)
    {
        return a + b;
    }

    int add(int a, int b, int c)
    {
        return a + b + c;
    }

    int add(int a, int b, int c, int d)
    {
        return a + b + c + d;
    }
}

public class OverloadScannerExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ClassCalculator Cal = new ClassCalculator();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of two Numbers: " + Cal.add(a, b));

        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Sum of three Numbers: " + Cal.add(a, b, c));

        // Four numbers
        System.out.print("Enter four numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Sum of four Numbers: " + Cal.add(a, b, c, d));

        sc.close();
    }
}

