/**
 * Java Operators - all tasks in one class
 */
public class Operators {

    /**
     * 1. Arithmetic with int (a=8, b=6)
     */
    public static void arithmeticInt() {
        int a = 8;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a % b);
    }

    /**
     * 2. Arithmetic with double (c=6.4, d=0.03)
     */
    public static void arithmeticDouble() {
        double c = 6.4;
        double d = 0.03;
        System.out.println(c + d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c - d);
        System.out.println(c % d);
    }

    /**
     * 3. Operator precedence example
     */
    public static void arithmeticPrecedence() {
        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println(x);
        System.out.println(y);
    }

    /**
     * 4. Unary operators and complex expression
     */
    public static void unaryOperators() {
        int e = 10;
        int f = -88;
        boolean n1 = true;

        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }

    /**
     * 5. Assignment and casting
     */
    public static void assignmentOperators() {
        int x = (int) 1.0;
        System.out.println(x);

        short y = (short) 1921222;
        System.out.println(y);

        System.out.println(2147483647 + 1);

        long z = (x = 3);
        System.out.println(z);

        boolean a = false;
        boolean b = (a = true);
        System.out.println(a);
    }

    /**
     * 6. Relational operators
     */
    public static void relationalOperators() {
        int x = 10;
        int y = 20;
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println(x > y);
    }

    /**
     * 7. Fixed type conversion errors
     */
    public static void fixErrors() {
        float y1 = 2.1f;
        System.out.println(y1);

        byte x2 = 5;
        byte y2 = 10;
        byte z2 = (byte) (x2 + y2);
        System.out.println(z2);

        short x3 = 10;
        short y3 = 3;
        short z3 = (short) (x3 * y3);
        System.out.println(z3);

        long x4 = 10;
        int y4 = 5;
        y4 = (int) (y4 * x4);
        System.out.println(y4);
    }

    /**
     * 8. Swap two numbers using temp variable
     */
    public static void swapWithTemp() {
        int a = 10;
        int b = 5;
        System.out.println("Before: a=" + a + ", b=" + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After:  a=" + a + ", b=" + b);
    }

    /**
     * 9. Swap two numbers without temp variable
     */
    public static void swapWithoutTemp() {
        int a = 10;
        int b = 5;
        System.out.println("Before: a=" + a + ", b=" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After:  a=" + a + ", b=" + b);
    }

    /**
     * 10. Sum of numbers from 1 to 100 (no loop)
     */
    public static void sumOneToHundred() {
        int n = 100;
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }

    /**
     * Bitwise and logical operators
     */
    public static void bitwiseAndLogical() {
        int a = 8;
        int b = 3;

        System.out.println(a & b);
        System.out.println(a ^ b);
        System.out.println(a | b);
        System.out.println(~a);
        System.out.println(true || (a < 4));
        System.out.println((b >= 6) || (++a <= 7));
        System.out.println((a < b) ? a : b);
        System.out.println(b ^ b);
    }

    /**
     * Shift operators + multiply by 8 and 16
     */
    public static void shiftOperators() {
        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);

        int value = 7;
        System.out.println(value << 3); // * 8
        System.out.println(value << 4); // * 16
    }

    /**
     * Main method - runs all tasks
     */
    public static void main(String[] args) {
        System.out.println("=== Arithmetic int ===");
        arithmeticInt();

        System.out.println("\n=== Arithmetic double ===");
        arithmeticDouble();

        System.out.println("\n=== Arithmetic precedence ===");
        arithmeticPrecedence();

        System.out.println("\n=== Unary operators ===");
        unaryOperators();

        System.out.println("\n=== Assignment operators ===");
        assignmentOperators();

        System.out.println("\n=== Relational operators ===");
        relationalOperators();

        System.out.println("\n=== Fixed type errors ===");
        fixErrors();

        System.out.println("\n=== Swap with temp ===");
        swapWithTemp();

        System.out.println("\n=== Swap without temp ===");
        swapWithoutTemp();

        System.out.println("\n=== Sum 1..100 ===");
        sumOneToHundred();

        System.out.println("\n=== Bitwise & Logical ===");
        bitwiseAndLogical();

        System.out.println("\n=== Shift operators ===");
        shiftOperators();
    }
}