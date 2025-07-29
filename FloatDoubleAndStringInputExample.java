// Q9. Program to display the input of float, double, and string in Java.
import java.util.Scanner;
public class FloatDoubleAndStringInputExample
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        //Float variable input from users
        System.out.println("Enter any float variable: ");
        float number1 = obj.nextFloat();
        System.out.println("You Entered a float value: " + number1);

        //Double variable input from users
        System.out.println("Enter any double variable: ");
        double number2 = obj.nextFloat();
        System.out.println("You Entered a double value: " + number2);

        //Getting String variable
        System.out.println("Enter any text: ");
        String str = obj.next();
        System.out.println("You Entered a string text: " + str);

        obj.close();
    }
}
