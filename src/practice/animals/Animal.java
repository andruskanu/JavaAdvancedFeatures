package practice.animals;

import practice.animals.enums.Species;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    private Species species;

    public Animal(Species species){
        this.species = species;
    }

    public static int totalCount = 0;
    static List<String> animalList = new ArrayList<>();

    abstract public String getName();
    abstract public String makeSound();

    public Species getSpecies(){
        return species;
    }
}
