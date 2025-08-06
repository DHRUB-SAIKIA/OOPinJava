public class CommandLineArgumentExample
{
    public static void main(String[] args)
    {
        if (args.length==0)
        {
            System.out.println("Please provide your name as a command line argument.");
        }
        else
        {
            System.out.println("Hello, "+args[0]);
        }
    }
}
