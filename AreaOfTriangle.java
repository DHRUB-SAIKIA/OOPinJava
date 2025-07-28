// Q3. Write a program to calculate the Area of Triangle and Rectangle
public class AreaOfTriangle
{
    public static void main(String args[])
    {
        // To Find The Area Of Triangle
        double base = 10;
        double height = 20;

        double areaoftrangle = 0.5*(base * height);
        System.out.println("Area of triangle = "+ areaoftrangle);

        // To Find The Area Of Ractrangle
        double length = 8;
        double breadth = 6;

        double areaofrectrangle = (length * breadth);
        System.out.println("Area of rectrangle = "+ areaofrectrangle);
    }
}
