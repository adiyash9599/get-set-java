import java.util.*;

public class functions {
    // public static void swap(int a, int b) {
    // swap => exchange
    // int temp = a;
    // a = b;
    // b = temp;

    // System.out.println("a = " + a);
    // System.out.println("b = " + b);
    // }

    // public static int multiply(int a, int b) {
    // int product = a * b;
    // return product;
    // }

    // public static int factorial(int n) {
    // int f = 1;

    // for (int i = 1; i <= n; i++) {
    // f *= i;
    // }
    // return f;
    // }

    // public static int binCoeff(int n, int r) {
    // int fact_n = factorial(n);
    // int fact_r = factorial(r);
    // int fact_nr = factorial(n - r);

    // int binCoeff = fact_n / (fact_r * fact_nr);
    // return binCoeff;
    // }

    // public static int sum(int a, int b) {
    // return a + b;
    // }

    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // public static float sum(float a, float b, float c) {
    // return a + b + c;
    // }

    // public static boolean isPrime(int n) {
    // boolean isPrime = true;
    // if (n == 2) {
    // return true;
    // }
    // for (int i = 2; i <= (n - 1); i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }

    // return true;
    // }

    // public static boolean isPrime(int n) {
    // if (n == 2) {
    // return true;
    // }

    // for (int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void primesInRange(int n) {
    // for (int i = 2; i <= n; i++) {
    // if (isPrime(i)) { // true
    // System.out.print(i + " ");
    // }
    // }
    // System.out.println();
    // }

    // public static void BinToDec(int binNum) {
    // int myNum = binNum;
    // int pow = 0;
    // int decNum = 0;

    // while (binNum > 0) {
    // int lastDigit = binNum % 10;
    // decNum += lastDigit * (int) Math.pow(2, pow);
    // pow++;
    // binNum /= 10;
    // }

    // System.out.println("decimal of " + myNum + " = " + decNum);
    // }

    // public static void decToBin(int n) {
    // int myNum = n;
    // int pow = 0;
    // int binNum = 0;

    // while (n > 0) {
    // int rem = n % 2;
    // binNum += rem * (int) Math.pow(10, pow);
    // pow++;
    // n /= 2;
    // }
    // System.out.println("binary form of " + myNum + " = " + binNum);
    // }

    // public static void avg(int a, int b, int c) {
    // int avg = (a + b + c) / 3;
    // System.out.println(avg);
    // }

    // public static boolean isEven(int n) {
    // if (n % 2 == 0) {
    // return true;
    // }
    // return false;
    // }

    // public static boolean isPalindrome(int n) {
    // int rev = 0;
    // int temp = n;

    // while (temp != 0) {
    // int rem = temp % 10;
    // rev = rev * 10 + rem;
    // temp /= 10;
    // }

    // if (n == rev) {
    // return true;
    // }
    // return false;

    // }

    // public static int sumOfDigits(int n) {

    // int sum = 0;

    // while (n > 0) {
    // int rem = n % 10;
    // sum += rem;
    // n /= 10;
    // }
    // return sum;

    // }

    public static void main(String args[]) {
        // int a = 5;
        // int b = 10;

        // swap(a, b);

        // int a = 3;
        // int b = 5;

        // int prod = multiply(a, b);
        // System.out.println("prod is: " + prod);

        // System.out.println(factorial(21));

        // System.out.println(binCoeff(5, 2));

        // System.out.println(sum(4, 9));
        // System.out.println(sum(4, 6, 9));

        // System.out.println(sum(4.3f, 5.6f, 6.6f));
        // System.out.println(sum(3, 2, 9));
        // System.out.println(isPrime(16));ṇ

        // primesInRange(200);

        // BinToDec(111);
        // decToBin(34);

        // Practice Questions
        // avg(7, 8, 9);
        // System.out.println(isEven(8));

        // double x = 5.0;
        // double y = 10.0;

        // return the maximum of two numbers
        // System.out.println("Maximum number of x and y is: " + Math.max(x, y));

        // return the square root of y
        // System.out.println("Square root of y is: " + Math.sqrt(y));

        // returns 28 power of 4 i.e. 28*28*28*28
        // System.out.println("Power of x and y is: " + Math.pow(x, y));

        // return the logarithm of given value
        // System.out.println("Logarithm of x is: " + Math.log(x));
        // System.out.println("Logarithm of y is: " + Math.log(y));

        // return the logarithm of given value when base is 10
        // System.out.println("log10 of x is: " + Math.log10(x));
        // System.out.println("log10 of y is: " + Math.log10(y));

        // return the log of x + 1
        // System.out.println("log1p of x is: " + Math.log1p(x));

        // return a power of 2
        // System.out.println("exp of a is: " + Math.exp(x));

        // return (a power of 2)-1
        // System.out.println("expm1 of a is: " + Math.expm1(x));

        // double a = 30;

        // converting values to radian
        // double b = Math.toRadians(a);

        // return the trigonometric sine of a
        // System.out.println("Sine value of a is: " + Math.sin(a));

        // return the trigonometric cosine value of a
        // System.out.println("Cosine value of a is: " + Math.cos(a));

        // return the trigonometric tangent value of a
        // System.out.println("Tangent value of a is: " + Math.tan(a));

        // return the trigonometric arc sine of a
        // System.out.println("Sine value of a is: " + Math.asin(a));

        // return the trigonometric arc cosine value of a
        // System.out.println("Cosine value of a is: " + Math.acos(a));

        // return the trigonometric arc tangent value of a
        // System.out.println("Tangent value of a is: " + Math.atan(a));

        // return the hyperbolic sine of a
        // System.out.println("Sine value of a is: " + Math.sinh(a));

        // return the hyperbolic cosine value of a
        // System.out.println("Cosine value of a is: " + Math.cosh(a));

        // return the hyperbolic tangent value of a
        // System.out.println("Tangent value of a is: " + Math.tanh(a));

        // int n;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // n = sc.nextInt();

        // if (isPalindrome(n)) {
        // System.out.println("Palindrome");
        // } else {
        // System.out.println("Not Palindrome");
        // }

        // int n;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // n = sc.nextInt();

        // System.out.println("Sum is " + sumOfDigits(n));
    }

}
