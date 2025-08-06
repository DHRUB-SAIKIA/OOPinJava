//Find The error in the given program:

//public class Test7
//{
//    public static void main(String[] args)
//    {
//        String lang = "Java";
//        if ("Java" )
//        {
//            System.out.println("Correct Language");
//        } else {
//            System.out.println("Wrong Language");
//        }
//    }
//}

public class Test7
{
    public static void main(String[] args)
    {
        String lang = "Java";
        if (lang.equals("Java") )
        {
            System.out.println("Correct Language");
        } else {
            System.out.println("Wrong Language");
        }
    }
}
