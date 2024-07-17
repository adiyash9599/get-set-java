import java.util.*;

public class loops {
    public static void main(String agrs[]) {
        // int counter = 0;
        // while (counter < 5) {
        // System.out.println("Aditya Chauhan");
        // counter++;
        // }
        // System.out.println("Printed Aditya Chauhan 100x");
        // int counter = 1;
        // while (counter <= 10) {
        // System.out.print(counter + " ");
        // counter++;
        // }
        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter = 0;
        // while (counter <= range) {
        // System.out.print(counter + " ");
        // counter++;
        // }
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while (i <= n) {
        // sum += i;
        // i++;
        // }
        // System.out.println("Sum is : " + sum);
        // for (int i = 1; i <= 10; i++) {
        // System.out.println("Adi");
        // }
        // for (int lines = 1; lines <= 4; lines++) {
        // System.out.println("* * * *");
        // }

        // int i = 1;
        // while (i <= 4) {
        // System.out.println("****");
        // i++;
        // }
        // int n = 10899;

        // while (n > 0) {
        // int lastDigit = n % 10;
        // System.out.print(lastDigit);
        // n = n / 10;
        // }

        // int n = 10899;
        // int rev = 0;

        // while (n > 0) {
        // int lastDigit = n % 10;
        // rev = (rev * 10) + lastDigit;
        // n = n / 10;
        // }
        // System.out.println(rev);
        // for (int i=1; i<=5; i++) {
        // if (i == 3) {
        // break;
        // }
        // System.out.println(i);
        // }
        // System.out.println("I am out of the loop");
        // Scanner sc = new Scanner(System.in);

        // do {
        // System.out.print("Enter your number : ");
        // int n = sc.nextInt();

        // if (n % 10 == 0) {
        // break;
        // }
        // System.out.println(n);
        // } while (true);
        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // continue;
        // }
        // System.out.println(i);
        // }
        // Scanner sc = new Scanner(System.in);
        // do {
        // System.err.print("Enter your number : ");
        // int n = sc.nextInt();
        // if (n % 10 == 0) {
        // continue;
        // }
        // System.err.println(n);
        // } while (true);
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // if (n == 2) {
        // System.out.println("n is prime");
        // } else {
        // boolean isPrime = true;
        // for(int i = 2; i <= Math.sqrt(n); i++) {
        // if (n % i == 0) { // n is multiple of i (i not equal to 1 or n)
        // isPrime = false;
        // }
        // }

        // if (isPrime == true) {
        // System.out.println("n is prime");
        // } else {
        // System.out.println("n is not prime");
        // }
        // }

        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hello");
        // i+=2;
        // } => prints 2 x Hello

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integers:");
        int integers = sc.nextInt();
        System.out.println(integers);

        // for (int i = 0; i <= 5; i++) {
        // System.out.println("i = " + i);
        // }
        // System.out.println("i after the loop = " + i); => i doesn't exist outside the
        // loop

    }
}
