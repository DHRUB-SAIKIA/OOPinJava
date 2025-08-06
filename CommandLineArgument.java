public class CommandLineArgument
{
    public static void main(String[] args)
    {
        System.out.println(args.length>0?"Hello"+ args[0]+"!" : "No name provided");
    }
}
