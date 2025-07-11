// implement the printFullName() method in the Student class.
// task 10 solve solve
class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // ito ung method to print the full name hehe
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }
}

public class Tasksheet122 {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey"),
        };

        for (Student s : students) {
            s.printFullName();
        }
    }
}
