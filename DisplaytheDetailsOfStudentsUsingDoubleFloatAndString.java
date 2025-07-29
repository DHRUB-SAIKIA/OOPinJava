// Q10. Write a java program to take input from user as student like
//Student Name as String
//Student Roll as integer
//Student Aadhaar Number as double
//Student Percentage as Float
//Display the details

import java.util.Scanner;
public class DisplaytheDetailsOfStudentsUsingDoubleFloatAndString
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        //Name input from users
        System.out.println("Enter the name of the student: ");
        String name = obj.next();

        //Roll no input from user
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the Roll number: ");
        int roll = Input.nextInt();

        //Aadhaar number input from users
        System.out.println("Enter the Aadhaar number: ");
        double aadhar = obj.nextDouble();

        //Percentage input from users
        System.out.println("Percentage of the student : ");
        float par = obj.nextFloat();

        //Outputs
        System.out.println("----------Student Details----------");
        System.out.println("Name of the student: " + name);
        System.out.println("Roll number        : "+ roll);
        System.out.println("Aadhaar Number     : " + aadhar);
        System.out.println("Percentage         : " + par);

        obj.close();
    }
}
