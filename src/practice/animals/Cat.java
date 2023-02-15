package practice.animals;

import practice.animals.enums.Species;
import java.util.Objects;

public class Cat extends Animal {

    private String name;
    private int id;

    public Cat(String name, int id) {
        super(Species.CAT);
        this.name = name;
        this.id = id;
        totalCount++;
        animalList.add(this.name);
    }

    public int getId() {
        return id;
    }

    @Override
    public String makeSound() {
        return "Miau";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, makeSound());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat cat = (Cat) obj;
        return id == cat.id;
    }
}
