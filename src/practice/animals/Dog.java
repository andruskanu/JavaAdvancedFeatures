package practice.animals;

import practice.animals.enums.Species;

public class Dog extends Animal implements Comparable {

    private String name;
    private int id;

    public Dog(String name, int id) {
        super(Species.DOG);
        this.name = name;
        this.id = id;
        totalCount++;
        animalList.add(this.name);
    }

    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public int compareTo(Object o) {
        if (this.getClass() != o.getClass()) {
            return -1;
        } else {
            Dog dog = (Dog) o;
            if (this.id > dog.id) {
                return 1;
            } else if (this.id < dog.id) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}