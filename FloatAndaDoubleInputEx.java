import java.util.Scanner;
public class FloatAndaDoubleInputEx
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        //Float variable input
        System.out.println("Enter any float variable: ");
        float number1 = obj.nextFloat();
        System.out.println("You Entered a float value: " + number1);
        obj.close();

        //Double variable input
        System.out.println("Enter any double variable: ");
        double number2 = obj.nextFloat();
        System.out.println("You Entered a double value: " + number2);
        obj.close();
    }
}
