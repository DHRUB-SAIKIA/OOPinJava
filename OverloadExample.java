class ClassCalculator
{
    int add (int a, int b)
    {
        return a+b;
    }
    int add (int a,int b,int c)
    {
        return a+b+c;
    }
    int add (int a,int b ,int c,int d)
    {
        return a+b+c+d;
    }
}
public class OverloadExample
{
    public static void main(String[] args)
    {
        ClassCalculator Cal=new ClassCalculator();
        System.out.println("Sum of two Numbers:"+Cal.add(10,20));
        System.out.println("Sum of three Numbers:"+Cal.add(10,20,30));
        System.out.println("Sum of four Numbers:"+Cal.add(10,20,30,40));

    }

}
