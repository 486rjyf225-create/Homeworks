import java.util.Scanner;

/**
 * Utility class with methods for conditional statements and loops tasks.
 */
public class StatementsUtil {

    /**
     * 1. Checks whether the given integer is even or odd.
     * @param x the number to check
     * @return true if even, false if odd
     */
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    /**
     * 2. Checks whether the given integer is positive or negative.
     * @param x the number to check
     * @return "positive", "negative" or "zero"
     */
    public static String isPositiveOrNegative(int x) {
        if (x > 0) {
            return "positive";
        } else if (x < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    /**
     * 3. Checks if the number is (greater than 5 and less than 8)
     *    or (greater than 15 and less than 20).
     * @param x the number to check
     * @return true if condition is satisfied
     */
    public static boolean isInRange(int x) {
        return (x > 5 && x < 8) || (x > 15 && x < 20);
    }

    /**
     * 4. Checks if the number is divisible by both 5 and 7 without remainder.
     * @param x the number to check
     * @return true if divisible by both 5 and 7
     */
    public static boolean isDivisibleBy5And7(int x) {
        return x % 5 == 0 && x % 7 == 0;
    }

    /**
     * 5. Checks if the middle digit of a three-digit number is 7.
     * Example: 974 -> true, 846 -> false
     * @param x three-digit number
     * @return true if middle digit is 7
     */
    public static boolean isMiddleDigit7(int x) {
        int middle = (x / 10) % 10;
        return middle == 7;
    }

    /**
     * 6. Checks if the point (x, y) is inside the circle
     * with center K(0, 5) and radius 5.
     * @param x x-coordinate
     * @param y y-coordinate
     * @return true if the point is inside or on the circle
     */
    public static boolean isInsideCircle(double x, double y) {
        // (x - 0)^2 + (y - 5)^2 <= 5^2
        return x * x + (y - 5) * (y - 5) <= 25;
    }

    /**
     * 7. Finds the maximum of three numbers.
     * @param a first number
     * @param b second number
     * @param c third number
     * @return the largest number
     */
    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    /**
     * 8. Checks whether the given year is a leap year.
     * Leap year: divisible by 4, but not by 100 unless also divisible by 400.
     * @param year the year to check
     * @return true if leap year
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * 11. Prints all numbers from 1 to 200.
     */
    public static void print1To200() {
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        }
    }

    /**
     * 12. Prints the first digit of the given number.
     * @param x the number
     */
    public static void printFirstDigit(int x) {
        x = Math.abs(x);
        while (x >= 10) {
            x /= 10;
        }
        System.out.println(x);
    }

    /**
     * 13. While x < 5 and y < 10, prints the value of x + y.
     * Starting values: x = 1, y = 0.
     * (x and y are incremented to avoid infinite loop)
     */
    public static void printWhileXY() {
        int x = 1;
        int y = 0;
        while (x < 5 && y < 10) {
            System.out.println(x + y);
            x++;
            y++;
        }
    }

    /**
     * 14. Prints a square of given size using * symbol.
     * @param size side length of the square
     */
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * 15. Reads N from console and calculates the sum of all numbers
     * from 1 to N that are divisible by 5.
     */
    public static void sumMultiplesOf5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    /**
     * 16. Calculates the product of all two-digit even numbers in range [1, N].
     * @param n upper bound
     * @return the product (0 if no such numbers)
     */
    public static long productOfTwoDigitEvens(int n) {
        long product = 1;
        boolean found = false;
        for (int i = 10; i <= n && i <= 98; i += 2) {
            product *= i;
            found = true;
        }
        return found ? product : 0;
    }

    /**
     * 17. Finds the minimum and maximum numbers in [1, N]
     * and returns their arithmetic mean.
     * @param n upper bound
     * @return arithmetic mean of min and max
     */
    public static double averageOfMinMax(int n) {
        int min = 1;
        int max = n;
        return (min + max) / 2.0;
    }

    /**
     * 18. Calculates the sum of digits of a five-digit integer.
     * @param x five-digit number
     * @return sum of its digits
     */
    public static int sumOfDigits(int x) {
        x = Math.abs(x);
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    /**
     * Demo method that calls all tasks with sample values.
     */
    public static void main(String[] args) {
        System.out.println("1. isEven(8) = " + isEven(8));
        System.out.println("1. isEven(7) = " + isEven(7));

        System.out.println("\n2. isPositiveOrNegative(5) = " + isPositiveOrNegative(5));
        System.out.println("2. isPositiveOrNegative(-3) = " + isPositiveOrNegative(-3));
        System.out.println("2. isPositiveOrNegative(0) = " + isPositiveOrNegative(0));

        System.out.println("\n3. isInRange(6) = " + isInRange(6));
        System.out.println("3. isInRange(17) = " + isInRange(17));
        System.out.println("3. isInRange(10) = " + isInRange(10));

        System.out.println("\n4. isDivisibleBy5And7(35) = " + isDivisibleBy5And7(35));
        System.out.println("4. isDivisibleBy5And7(20) = " + isDivisibleBy5And7(20));

        System.out.println("\n5. isMiddleDigit7(974) = " + isMiddleDigit7(974));
        System.out.println("5. isMiddleDigit7(846) = " + isMiddleDigit7(846));

        System.out.println("\n6. isInsideCircle(0, 5) = " + isInsideCircle(0, 5));
        System.out.println("6. isInsideCircle(3, 5) = " + isInsideCircle(3, 5));
        System.out.println("6. isInsideCircle(6, 5) = " + isInsideCircle(6, 5));

        System.out.println("\n7. maxOfThree(4, 9, 2) = " + maxOfThree(4, 9, 2));

        System.out.println("\n8. isLeapYear(2024) = " + isLeapYear(2024));
        System.out.println("8. isLeapYear(1900) = " + isLeapYear(1900));
        System.out.println("8. isLeapYear(2000) = " + isLeapYear(2000));

        System.out.println("\n12. First digit of 58321:");
        printFirstDigit(58321);

        System.out.println("\n13. while x < 5 && y < 10:");
        printWhileXY();

        System.out.println("\n14. Square 4x4:");
        printSquare(4);

        System.out.println("\n16. productOfTwoDigitEvens(50) = " + productOfTwoDigitEvens(50));

        System.out.println("\n17. averageOfMinMax(100) = " + averageOfMinMax(100));

        System.out.println("\n18. sumOfDigits(12345) = " + sumOfDigits(12345));
    }
}
