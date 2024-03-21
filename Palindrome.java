import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {
        int num, rev = 0, temp, rem;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer value:");
        num = sc.nextInt();
        temp = num;

        while (num > 0) {
            rem = num % 10;  // getting remainder
            rev = (rev * 10) + rem;
            num = num / 10;
        }

        if (temp == rev)
            System.out.println("Palindrome number");
        else
            System.out.println("Not palindrome");
    }
}
