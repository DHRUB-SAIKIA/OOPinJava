import java.util.Scanner;
class Bank
{
    String BankName;
    void ShowBookName()
    {
        System.out.println("Your Bank is: "+BankName);
    }
}
class Account extends Bank
{
    int Balance;
    void ShowBalance()
    {
        System.out.println("Your Balance: "+Balance );
    }
}
public class SingleInharitanceClass2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
                Account obj = new Account();
        System.out.println("Enter your Balance: ");
        obj.Balance=sc.nextInt();
        obj.ShowBookName();
        obj.ShowBalance();
    }
}