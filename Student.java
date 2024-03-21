import java.util.Scanner;

class Student {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name : ");
        String fname = scanner.nextLine();

        System.out.println("Enter Last Name : ");
        String lname = scanner.nextLine();

        System.out.println("Enter Qualification : ");
        String qualification = scanner.nextLine();

        System.out.println("Enter Percentage : ");
        int percentage = scanner.nextInt();

        System.out.println("Name :" + fname + " " + lname);
        System.out.println("Qualification :" + qualification);
        System.out.println("Percentage :" + percentage);
    }
}
