import java.util.Scanner;

class Q2EmployeeDetails
{
    void getDetails (String name)
    {
        System.out.println ("The Employee name is: " + name);
    }

    void getDetails (String name, int EmployeeID)
    {
        System.out.println ("The Employee name is: " + name);
        System.out.println ("The Employee ID is: " + EmployeeID);
    }

    void getDetails (String name, int EmployeeID, double Salary)
    {
        System.out.println ("The Employee name is: " + name);
        System.out.println ("The Employee ID is: " + EmployeeID);
        System.out.println ("The Employee Salary is: " + Salary);
    }
}

class FunctionOverloading
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q2EmployeeDetails emp = new Q2EmployeeDetails();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        emp.getDetails(name);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        emp.getDetails(name, id);

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        emp.getDetails(name, id, salary);

        sc.close();
    }
}
