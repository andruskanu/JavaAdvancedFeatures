package oopconcepts.school;

public class Person {

    private String firstName;
    private String lastName;
    private long cnp;
    private int age;

    public Person(String firstName, String lastName, long cnp, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
        this.age = age;
    }

    //***************** GETTER *****************
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public long getCnp() {
        return this.cnp;
    }

    public int getAge() {
        return this.age;
    }


    //***************** SETTER *****************
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "My name is " +
                firstName + " " +
                lastName + " and I am " + age + " years old. ";
    }
}
