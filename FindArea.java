//Q13. WAP in Java to calculate the area of a triangle, rectangle, circle, parallelogram by taking user input.

import java.util.Scanner;
public class FindArea
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a Shape to calculate: 1. Triangle, 2. Rectangle, 3. Circle, 4. Parallelogram, 5. Exit \nEnter your choice (1-5): ");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                // Triangle
                System.out.print("Enter base of triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = sc.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of Triangle = " + triangleArea);
                break;

            case 2:
                // Rectangle
                System.out.print("Enter length of rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double breadth = sc.nextDouble();
                double rectangleArea = length * breadth;
                System.out.println("Area of Rectangle = " + rectangleArea);
                break;

            case 3:
                // Circle
                System.out.print("Enter radius of circle: ");
                double radius = sc.nextDouble();
                double circleArea = 3.14 * radius * radius;
                System.out.println("Area of Circle = " + circleArea);
                break;

            case 4:
                // Parallelogram
                System.out.print("Enter base of parallelogram: ");
                double pBase = sc.nextDouble();
                System.out.print("Enter height of parallelogram: ");
                double pHeight = sc.nextDouble();
                double parallelogramArea = pBase * pHeight;
                System.out.println("Area of Parallelogram = " + parallelogramArea);
                break;

            case 5:
                System.out.println("Exiting program. Thank you!");
                break;

            default:
                System.out.println("Invalid choice. Please select from 1 to 5.");
        }
        while (choice != 5);
        sc.close();
    }
}
