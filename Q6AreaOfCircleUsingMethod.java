//Q6.Area of Circle
//Make a method areaOfCircle(double radius) that returns the area of a circle.

public class Q6AreaOfCircleUsingMethod
{
    public static double areaOfCircle(double radius)
    {
        if (radius < 0)
        {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        return Math.PI * radius * radius;
    }

    public static void main(String[] args)
    {
        double radius = 5.0;
        System.out.println("Area of circle: " + areaOfCircle(radius));
    }
}
