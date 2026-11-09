public class Variables {
    public static void task1_byteVariables() {
        byte a = 10;
        byte b = -25;
        System.out.println("Task 1 - byte variables:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
    }

    public static void task2_shortVariables() {
        short c = 1000;
        short d = -5000;
        System.out.println("Task 2 - short variables:");
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println();
    }

    public static void task3_intVariables() {
        int e = 100000;
        int f = -200000;
        System.out.println("Task 3 - int variables:");
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println();
    }

    public static void task4_longVariables() {
        long g = 10000000000L;
        long h = -5000000000L;
        System.out.println("Task 4 - long variables:");
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println();
    }

    public static void task5_integerMinMax() {
        System.out.println("Task 5 - Integer types Min & Max:");
        System.out.println("byte  Min = " + Byte.MIN_VALUE + ", Max = " + Byte.MAX_VALUE);
        System.out.println("short Min = " + Short.MIN_VALUE + ", Max = " + Short.MAX_VALUE);
        System.out.println("int   Min = " + Integer.MIN_VALUE + ", Max = " + Integer.MAX_VALUE);
        System.out.println("long  Min = " + Long.MIN_VALUE + ", Max = " + Long.MAX_VALUE);
        System.out.println();
    }

    public static void task6_binaryAssignment() {
        byte binaryByte = 0b1010;   // 10 in decimal
        int  binaryInt  = 0b1100100; // 100 in decimal
        System.out.println("Task 6 - Binary assignment:");
        System.out.println("byte binaryByte = 0b1010  -> " + binaryByte);
        System.out.println("int  binaryInt  = 0b1100100 -> " + binaryInt);
        System.out.println();
    }

    public static void task6_floatVariables() {
        float j = 3.14f;
        float k = -2.5f;
        System.out.println("Task 6 (Float) - float variables:");
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println();
    }

    public static void task7_doubleVariables() {
        double l = 3.141592653589793;
        double m = -1.618033988749895;
        System.out.println("Task 7 - double variables:");
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println();
    }

    public static void task8_floatDoubleMinMax() {
        System.out.println("Task 8 - Floating-point types Min & Max:");
        System.out.println("float  Min = " + Float.MIN_VALUE + ", Max = " + Float.MAX_VALUE);
        System.out.println("double Min = " + Double.MIN_VALUE + ", Max = " + Double.MAX_VALUE);
        System.out.println();
    }

    public static void task9_floatDoubleAssignment() {
        System.out.println("Task 9 - Which values can be assigned to float / double:");

        double d1 = 34.567839023;
        double d2 = 12.345;
        double d3 = 8923.1234857;
        double d4 = 3456.091;

        float f1 = (float) 34.567839023;
        float f2 = 12.345f;
        float f3 = (float) 8923.1234857;
        float f4 = 3456.091f;

        System.out.println("All four values can be assigned to double (default literal type).");
        System.out.println("All four values can be assigned to float with an 'f' suffix or explicit cast.");
        System.out.println("Note: float has ~7 decimal digits of precision; double has ~15-16.");
        System.out.println("Example assignments:");
        System.out.println("  double d1 = 34.567839023;  -> " + d1);
        System.out.println("  float  f2 = 12.345f;       -> " + f2);
        System.out.println("  float  f1 = (float)34.567839023; -> " + f1);
        System.out.println();
    }

    public static void task10_charVariables() {
        char n = 'A';
        char o = 'z';
        System.out.println("Task 10 - char variables:");
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        System.out.println();
    }

    public static void task11_1_unicodeChars() {
        char s = 77;   // 'M'
        char w = 109;  // 'm'
        System.out.println("Task 11.1 - char from Unicode code points:");
        System.out.println("char s = 77;  -> " + s);
        System.out.println("char w = 109; -> " + w);
        System.out.println();
    }

    public static void task11_2_printK() {
        System.out.println("Task 11.2 - Print 'K' in all possible ways:");
        System.out.println("Literal:          " + 'K');
        System.out.println("Unicode escape:   " + '\u004B');
        System.out.println("Integer code:     " + (char) 75);
        System.out.println("Hex literal:      " + (char) 0x4B);
        System.out.println("Octal literal:    " + (char) 0113);
        System.out.println();
    }

    public static void task12_booleanVariables() {
        boolean p = true;
        boolean q = false;
        System.out.println("Task 12 - boolean variables:");
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println();
    }

    public static void task13_printExplanation() {
        System.out.println("Task 13 - What does this code print and why?");
        System.out.println("Code: int year = 2011; System.out.print(year);");
        int year = 2011;
        System.out.print("Output: ");
        System.out.print(year);
        System.out.println();
        System.out.println("Explanation: The variable 'year' is assigned the integer value 2011.");
        System.out.println("System.out.print(year) outputs the current value of the variable");
        System.out.println("without adding a newline. Therefore it prints: 2011");
        System.out.println();
    }

    public static void taskWideningCasting() {
        System.out.println("Java Type Casting - Widening Casting (automatic):");
        System.out.println("Converts a smaller type to a larger type size.");
        System.out.println("byte -> short -> int -> long -> float -> double");
        System.out.println();

        byte  bVal = 10;
        short sVal = bVal;
        int   iVal = sVal;
        long  lVal = iVal;
        float fVal = lVal;
        double dVal = fVal;

        System.out.println("byte  bVal = 10;");
        System.out.println("short sVal = bVal;   -> " + sVal);
        System.out.println("int   iVal = sVal;   -> " + iVal);
        System.out.println("long  lVal = iVal;   -> " + lVal);
        System.out.println("float fVal = lVal;   -> " + fVal);
        System.out.println("double dVal = fVal;  -> " + dVal);
        System.out.println();
    }
    public static void main(String[] args) {

        task1_byteVariables();
        task2_shortVariables();
        task3_intVariables();
        task4_longVariables();
        task5_integerMinMax();
        task6_binaryAssignment();

        task6_floatVariables();
        task7_doubleVariables();
        task8_floatDoubleMinMax();
        task9_floatDoubleAssignment();

        task10_charVariables();
        task11_1_unicodeChars();
        task11_2_printK();

        task12_booleanVariables();
        task13_printExplanation();

        taskWideningCasting();

    }

}