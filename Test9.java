//Find The error in the given program:

//public class Test9
// {
//    public static void main(String[] args)
//    {
//        char grade = 'A';
//        switch grade
//        {
//            case 'A': System.out.println("Excellent");
//                break;
//            case 'B': System.out.println("Good");
//                break;
//        }
//

public class Test9
{
    public static void main(String[] args)
    {
        char grade = 'A';
        switch (grade) {
            case 'A': System.out.println("Excellent");
                break;
            case 'B': System.out.println("Good");
                break;
        }
    }
}
