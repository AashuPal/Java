import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        String name = "Raj";
        System.out.println("Hello " + name);
        int num = 12;
        float num1 = 12.5f;
        System.out.println(num + num1);

        // Rules for constructing a variable in java
        // 1. A variable name must start with a letter, $ or _
        // 2. A variable name can contain only letters, numbers, $ or _
        // 3. A variable name cannot contain any spaces
        // 4. A variable name cannot be a java keyword.
        // 5. A variable name cannot be a java reserved word.
        // Data types in java
        // 1. Primitive data types-byte, short(2 byte), int(4 byte), long, float,
        // double, char, boolean
        // 2. Non-primitive data types
        // 3. Reference data types
        byte u = -56;
        double d = 12.56896456785;
        char A = 'A';
        System.out.println(A);
        // Types of operators in java
        // 1. Arithmetic operators
        // 2. Assignment operators
        // 3. Comparison operators
        // 4. Logical operators
        // 5. Bitwise operators
        // 6. Ternary operators
        // 7. Unary operators
        // 8. Increment and decrement operators
        // 9. Relational operators
        // 10. Conditional operators
        // 11. Bitwise operators
        // 12. Shift operators
        // 13. Assignment operators
        // 14. Misc operators
        // 15. Operator precedence
        // 16. Operator associativity
        // 17. Operator grouping
        int a = 78, b = 98;
        System.out.print("The sum of " + a + " and " + b + " is ");
        System.out.println(a + b);
        System.out.print("The sum of " + a + " and " + b + " is ");
        System.out.println(a * b);
        System.out.println(a--);
        System.out.println(++b);
        System.out.println(+a - b--);
        // comparison operators
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
        // Logical operators
        System.out.println(a > b && a < b); // false
        System.out.println(a > b || a < b); // true
        System.out.println(!(a > b)); // true
        // Bitwise operators
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        // User input in java
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name1 = scan.nextLine();
        System.out.println("Hello " + name1);

    }
}
