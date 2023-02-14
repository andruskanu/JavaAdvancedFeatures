package practice.animals;

import static practice.animals.Animal.animalList;

public class AnimalsMain {

    public static void main(String[] args) {

        Animal[] animals = new Animal[10];

        System.out.println("We have a total of " + Animal.totalCount + " animals");

        animals[0] = new Dog("Thor", 2);
        animals[1] = new Dog("Milo", 5);
        animals[2] = new Cow("Paula");
        animals[3] = new Dog("Max", 1);
        animals[4] = new Cat("Daisy", 6);
        animals[5] = new Cow("Brownie");
        animals[6] = new Cat("Bagheera", 3);
        animals[7] = new Cat("Tomas", 3);

        System.out.println("We have a total of " + Animal.totalCount + " animals");

        for (int i = 0; i <= 7; i++) {
            System.out.println(animals[i].getName() + " " + animals[i].makeSound() + " "
                    + animals[i].getSpecies() + " " + animals[i].hashCode());
        }

        new Cat("Tom", 8);
        new Chicken("Duffy");

        System.out.println("================================");

        System.out.println(animalList);

        System.out.println("================================");

        if (animals[6].equals(animals[7])) {
            System.out.println("Bagheera cat equals Tomas cat -> true");
        } else {
            System.out.println("Bagheera cat equals Tomas cat -> false");
        }
    }
}
