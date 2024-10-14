import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Details:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Age: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        System.out.print("Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Course: ");
        String studentCourse = scanner.nextLine();
        System.out.print("Units: ");
        int studentUnits = scanner.nextInt();
        System.out.print("Fee per Unit 1000 ");
        double feePerUnit = scanner.nextDouble();

        Student student = new Student(studentName, studentAge, studentId, studentCourse, studentUnits, feePerUnit);
        System.out.println("\nStudent Details:");
        student.printDetails();

        scanner.nextLine(); // consume the newline

        System.out.println("\nEnter Instructor Details:");
        System.out.print("Name: ");
        String instructorName = scanner.nextLine();
        System.out.print("Age: ");
        int instructorAge = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        System.out.print("Employee ID: ");
        String employeeId = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        Instructor instructor = new Instructor(instructorName, instructorAge, employeeId, department, salary);
        System.out.println("\nInstructor Details:");
        instructor.printDetails();
        
        scanner.close();
    }
}