package practice.school;

public class Student extends Person{

    private Double examGrade;

    public Student(String firstName, String lastName, long cnp, int age, Double examGrade) {
        super(firstName, lastName, cnp, age);
        this.examGrade = examGrade;
    }

    public Double getExamGrade() {
        return this.examGrade;
    }

    public void setExamGrade(Double examGrade){
        this.examGrade = examGrade;
    }

    public String toString() {
        return "Hi! I am a student. " + super.toString() +
                "I have the admission average " + examGrade;
    }
}
