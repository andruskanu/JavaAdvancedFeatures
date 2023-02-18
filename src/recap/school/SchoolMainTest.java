package recap.school;

public class SchoolMainTest extends Person {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("Andrei","Balan",29);

        System.out.println(p2);
        p1.setFirstName("Cosmin");
        p1.setLastName("Radoi");
        p1.setAge(34);
        System.out.println(p1);

        System.out.println("==========================================");

        Student s1 = new Student("Matei","Buzera",25,8,"1970909");
        System.out.println(s1);

        Student s2 = new Student("Dragos","Roncea",30,9.5,"1930214");
        System.out.println(s2);
    }
}
