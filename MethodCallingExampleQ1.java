public class MethodCallingExampleQ1
{
    public static void printName()
    {
    System.out.println("Name: Dhruba saikia");
    }

    public static void printAddress()
    {
        System.out.println("Address: Tezpur,Assam,India");
    }

    public static void printAge()
    {
        System.out.println("Age: 18");
    }

    public static void printAllInfo()
    {
        printName();
        printAddress();
        printAge();
    }

    public static void main(String[] args)
    {
        printAllInfo();
    }
}
