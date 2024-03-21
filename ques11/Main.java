import java.util.Scanner;

class StudentInfo {
    String name;
    String gender;
    int age;
    String address;
    long contact;

    void accept() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        name = scanner.nextLine();

        System.out.println("Enter Gender (M/F): ");
        gender = scanner.nextLine();

        System.out.println("Enter Age: ");
        age = scanner.nextInt();

        scanner.nextLine(); 
        System.out.println("Enter Address: ");
        address = scanner.nextLine();

        System.out.println("Enter Contact Number: ");
        contact = scanner.nextLong(); 
    }

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contact);
    }
}

class BCA extends StudentInfo {
    String subjects;
    String options;

    void accept_BCA() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter BCA Details:");

        System.out.println("Enter BCA Subjects: ");
        subjects = scanner.nextLine();

        System.out.println("Enter BCA Options: ");
        options = scanner.nextLine();
    }

    void display_BCA() {
        System.out.println("\nBCA Details:");
        System.out.println("Subjects: " + subjects);
        System.out.println("Options: " + options);
    }
}

class BBA extends StudentInfo {
    String subjects;
    String options;

    void accept_BBA() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter BBA Details:");

        System.out.println("Enter BBA Subjects: ");
        subjects = scanner.nextLine();

        System.out.println("Enter BBA Options: ");
        options = scanner.nextLine();
    }

    void display_BBA() {
        System.out.println("\nBBA Details:");
        System.out.println("Subjects: " + subjects);
        System.out.println("Options: " + options);
    }
}

public class Main {
    public static void main(String[] args) {
        BCA bcaStudent = new BCA();
        BBA bbaStudent = new BBA();

        System.out.println("Enter details for BCA Student:");
        bcaStudent.accept();
        bcaStudent.accept_BCA();

        System.out.println("Enter details for BBA Student:");
        bbaStudent.accept();
        bbaStudent.accept_BBA();

        System.out.println("\nDisplaying Details:");

        bcaStudent.display();
        bcaStudent.display_BCA();

        bbaStudent.display();
        bbaStudent.display_BBA();
    }
}
