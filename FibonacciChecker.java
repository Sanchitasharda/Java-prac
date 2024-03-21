import java.util.Scanner;

class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it's part of the Fibonacci series: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println(number + " is part of the Fibonacci series.");
        } else {
            System.out.println(number + " is not part of the Fibonacci series.");
        }

        System.out.println("Fibonacci Series up to " + number + ":");
        printFibonacciSeries(number);
    }

    static boolean isFibonacci(int num) {
        int a = 0, b = 1, c;

        while (a <= num) {
            if (a == num) {
                return true;
            }
            c = a + b;
            a = b;
            b = c;
        }

        return false;
    }

    static void printFibonacciSeries(int limit) {
        int a = 0, b = 1, c;

        while (a <= limit) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
