//Q7.Reverse an Array
//Write a method reverseArray(int arr[]) that takes an array and prints it in reverse order.

public class Q7ReverseAnArray
{
    public static void reverseArray(int arr[])
    {
        if (arr == null)
        {
            System.out.println("Array is null.");
            return;
        }
        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // move to next line after printing
    }

    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5};
        reverseArray(numbers); // Output: 5 4 3 2 1
    }
}
