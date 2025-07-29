// Q8. Programm to take user input in Java.
import java.util.Scanner;

public class InExample
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int number = Input.nextInt();
        System.out.println("You number is: "+ number);
        Input.close();

    }
}
