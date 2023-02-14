package practice.animals;

import practice.animals.enums.Species;

public class Cow extends Animal{

    private String name;

    Cow(String name){
        super(Species.COW);
        this.name = name;
        totalCount++;
        animalList.add(this.name);
    }

    @Override
    public String getName(){
        return "Milka";
    }

    @Override
    public String makeSound(){
        return "Muuu";
    }
}
