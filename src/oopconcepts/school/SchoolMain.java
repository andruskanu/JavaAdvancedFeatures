package oopconcepts.school;

import oopconcepts.school.enums.Occupation;

public class SchoolMain {

    public static void main(String[] args) {

        Student s1 = new Student(
                "Matei",
                "Buzera",
                1944334343,
                25,
                8.5);

        System.out.println(s1);

        Teacher t1 = new Teacher(
                "Ion",
                "Antonescu",
                1323334343,
                44,
                "MATH");

        System.out.println(t1);

        Employee e1 = new Employee(
                "Mihai",
                "Stoian",
                1434343,
                51,
                Occupation.DIRECTOR);

        System.out.println(e1);
    }
}

