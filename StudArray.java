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

    public static void main(String args[]) {
        // Creating an array of StudentInfo objects
        StudentInfo[] students = new StudentInfo[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new StudentInfo();
            students[i].accept();
        }

        System.out.println("\nDetails of 3 Students:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDetails for Student " + (i + 1) + ":");
            students[i].display();
        }
    }
}
