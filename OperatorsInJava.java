// Q7. Programm to demonstrate the operators in Java.
public class OperatorsInJava
{
    public static void main(String args[])
    {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetie Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b));  // Modulus

        // 2. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b:" + (a == b)); // Equal to
        System.out.println("a ! = b: " + (a != b)); // Not equal to
        System.out.println("a › b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a )); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // 3. Logical Operators
        boolean x = true, y= false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));// Logical NOT

        // 4. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a; // Simple assignment
        c += 5;  // c = c + 5
        System.out.println("c after += 5: " + c);
        c *= 2;
        System.out.println("c after *=.2: " + c);

        // 5. Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 7;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d)); // Pre-increment
        System.out.println("d++ = " + (d++)); // Post-increment
        System.out.println("d = " + d);
        System.out.println("--d = " + (--d)); // Pre-decrement
        System.out.println("d-- = " + (d--)); // Post-decrement
        System.out.println("d = " + d);
    }
}
