class Book
{
    void Read()
    {
        System.out.println("Reading a Book");
    }
}

class Novel extends Book
{
    void Genre()
    {
        System.out.println("This is a mistry Novel");
    }
}

public class SingleInharitanceClass1
{
    public static void main(String[] args)
    {
        Novel n=new Novel();
        n.Read();
        n.Genre();
    }
}