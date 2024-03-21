import java.util.Scanner;

class StudentInfo {
    String name;
    String gender;
    int age;
    String address;
    long contact; // 

    void accept() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name please-- ");
        name = scanner.nextLine();

        System.out.println("Enter gender (M/F) -- ");
        gender = scanner.nextLine();

        System.out.println("Enter Age : ");
        age = scanner.nextInt();

        scanner.nextLine(); 
        System.out.println("Enter address here-- ");
        address = scanner.nextLine();

        System.out.println("Enter ContactNum please--");
        contact = scanner.nextLong(); 
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println("Contact Number: " + this.contact);
    }

    public static void main(String args[]) {
        StudentInfo s1 = new StudentInfo();
        s1.accept();
        s1.display();
    }
}
