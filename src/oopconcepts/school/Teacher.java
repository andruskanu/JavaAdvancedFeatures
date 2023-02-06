package oopconcepts.school;

import oopconcepts.school.enums.Subject;

public class Teacher extends Person{

    private Subject subject;

    public Teacher(String firstName, String lastName, long cnp, int age, String subject) {
        super(firstName, lastName, cnp, age);
        this.subject = Subject.valueOf(subject);
    }

    public Subject getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = Subject.valueOf(subject);
    }

    @Override
    public String toString() {
        return "Hi! I am a teacher. " + super.toString() +
                "I teach " + subject + " to students.";
    }
}
