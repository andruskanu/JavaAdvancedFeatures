package recap.school;

public class Student extends Person {

    double grade;
    String cnp;

    Student(String firstName, String lastName, int age, double grade, String cnp){
        super(firstName, lastName, age);
        this.grade = grade;
        this.cnp = cnp;
    }

    public String toString() {
        return "The student: " + super.toString() + "grade: " + grade + ", CNP: " + cnp;   }
}
