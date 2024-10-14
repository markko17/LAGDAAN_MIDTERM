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