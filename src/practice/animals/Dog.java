package practice.animals;

import practice.animals.enums.Species;

public class Dog extends Animal{

    private String name;
    private int id;

    public Dog(String name, int id){
        super(Species.DOG);
        this.name = name;
        this.id = id;
        totalCount++;
        animalList.add(this.name);
    }

    public int getId(){
        return id;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String makeSound(){
        return "Woof";
    }
}
