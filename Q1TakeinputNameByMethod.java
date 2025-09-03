import java.util.Scanner;

class Q1TakeinputNameByMethod
{

        // 1. Method with only name
        void getDetails(String name)
        {
            System.out.println("Name: " + name);
        }

        // 2. Method with name and employee ID
        void getDetails(String name, int empId)
        {
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + empId);
        }

        // 3. Method with name, employee ID, and salary
        void getDetails(String name, int empId, double salary)
        {
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + empId);
            System.out.println("Salary: " + salary);
        }
}

class FunctionOverloadingDemo
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            Q1TakeinputNameByMethod emp = new Q1TakeinputNameByMethod();

            // Example calls
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
