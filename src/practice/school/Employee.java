package practice.school;

import practice.school.enums.Occupation;

public class Employee extends Person {

    private Occupation occupation;

    public Employee(String firstName, String lastName, long cnp, int age, Occupation occupation) {
        super(firstName, lastName, cnp, age);
        this.occupation = occupation;
    }

    public Occupation getOccupation() {
        return this.occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = Occupation.valueOf(occupation);
    }

    public String toString() {
        return "Hi! " + super.toString() +
                "I am employed and hold the position of " + occupation;
    }
}
