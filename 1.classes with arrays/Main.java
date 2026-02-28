import java.util.Scanner;
public class Main {

    static class Student {

        String name;
        byte age;
        byte rollNumber;
        char grade;
        boolean isHosteller;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] student = new Student[3];

        student[0] = new Student();
        System.out.print("Enter name of first student: ");
        student[0].name = scanner.nextLine();
        System.out.print("Enter age of first student: ");
        student[0].age = scanner.nextByte();
        System.out.print("Enter roll no. of first student: ");
        student[0].rollNumber = scanner.nextByte();
        System.out.print("Enter grade of first student: ");
        student[0].grade = scanner.next().charAt(0);
        System.out.print("Are they a hosteller: ");
        student[0].isHosteller = scanner.nextBoolean();

        student[1] = new Student();
        System.out.print("Enter name of second student: ");
        student[1].name = scanner.nextLine();
        System.out.print("Enter age of second student: ");
        student[1].age = scanner.nextByte();
        System.out.print("Enter roll no. of second student: ");
        student[1].rollNumber = scanner.nextByte();
        System.out.print("Enter grade of second student: ");
        student[1].grade = scanner.next().charAt(0);
        System.out.print("Are they a hosteller: ");
        student[1].isHosteller = scanner.nextBoolean();

        student[2] = new Student();
        student[2].name = "C";
        student[2].age = (byte) 20;
        student[2].rollNumber = (byte) 103;
        student[2].grade = 'A';
        student[2].isHosteller = true;

        for (int i = 0; i < student.length; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Name: " + student[i].name);
            System.out.println("Age: " + student[i].age);
            System.out.println("Roll No: " + student[i].rollNumber);
            System.out.println("Grade: " + student[i].grade);
            System.out.println("Hosteller: " + student[i].isHosteller);
        }
        scanner.close();
    }
}
