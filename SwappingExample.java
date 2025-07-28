// Q5.Write a Java program to Swap the value using
// i. Third variable
// ii. Not using Third variable

public class SwappingExample
{
    public static void main(String args[])
    {
        // Swap using third variable
        int a1=10;
        int b1=20;
        System.out.println("____Swapping with Third Variable____");
        System.out.println("Before Swapping ::");
        System.out.println("a:" + a1 + ", b:" + b1);
        //logic
        int temp=a1;
        a1 = b1;
        b1 = temp;
        System.out.println("After Swapping::");
        System.out.println("a:" + a1 + ", b:" + b1);

        // Swap without third variable
        int a2=100;
        int b2 =200;
        System.out.println("____Swapping without Third Variable____");
        System.out.println("Before Swapping ::");
        System.out.println("a:" + a2 + ", b:" + b2);
        //logic
        a2 = a2 + b2;
        b2 = a2 - b2;
        a2 = a2 - b2;
        System.out.println("After Swapping::");
        System.out.println("a:" + a2 + ", b:" + b2);
    }
}
