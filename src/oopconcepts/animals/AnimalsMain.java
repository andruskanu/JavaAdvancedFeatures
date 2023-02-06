package oopconcepts.animals;

public class AnimalsMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog.makeSound());

        Cat cat = new Cat();
        System.out.println(cat.makeSound());

        Cow cow = new Cow();
        System.out.println(cow.makeSound());

        System.out.println("================");

        Animal[] animals = new Animal[10];

        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Cow();
        animals[3] = new Dog();
        animals[4] = new Cat();
        animals[5] = new Cow();

        for(int i=0;i<=5;i++){
            System.out.println(animals[i].makeSound());
        }
    }
}
