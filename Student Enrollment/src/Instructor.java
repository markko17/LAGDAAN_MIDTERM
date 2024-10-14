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