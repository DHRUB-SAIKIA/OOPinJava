//Q4.Find Largest Number
//Create a method findLargest(int x, int y, int z) that takes three integers and returns the largest one.

public class Q4FindLargestNumber
{
    public static int findLargest(int x, int y, int z)
    {
        int largest = x;

        if (y > largest)
        {
            largest = y;
        }
        if (z > largest)
        {
            largest = z;
        }

        return largest;
    }

    public static void main(String[] args)
    {
        System.out.println(findLargest(10, 25, 7));
    }
}
