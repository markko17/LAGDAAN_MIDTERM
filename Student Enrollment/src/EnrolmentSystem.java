import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private String studentId;
    private String course;
    private int units;
    private double feePerUnit;

    public Student(String name, int age, String studentId, String course, int units, double feePerUnit) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
        this.units = units;
        this.feePerUnit = feePerUnit;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + (units * feePerUnit));
    }
}

class Instructor extends Person {
    private String employeeId;
    private String department;
    private double salary;

    public Instructor(String name, int age, String employeeId, String department, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class EnrolmentSystem {
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
        System.out.print("Fee per Unit: ");
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
