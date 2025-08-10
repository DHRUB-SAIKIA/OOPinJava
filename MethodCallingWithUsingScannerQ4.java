import java.util.Scanner;
public class MethodCallingWithUsingScannerQ4
{
    static void Display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Your Address: ");
        String address = sc.nextLine();

        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        System.out.println("Your Name is : "+ name);
        System.out.println("Your Address is: "+ address);
        System.out.println("Enter Your Age: "+ age);
        sc.close();
    }

    public static void main(String[] args) {
        Display();
    }
}
