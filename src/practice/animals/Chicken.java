package practice.animals;

import practice.animals.enums.Species;
import practice.food.Eatable;

public class Chicken extends Animal implements Eatable {

    private String name;

    Chicken(String name){
        super(Species.CHICKEN);
        this.name = name;
        totalCount++;
        animalList.add(this.name);
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String makeSound() {
        return "Piu Piu";
    }

    @Override
    public int getKcal() {
        return 200;
    }

    @Override
    public int getProteinCount() {
        return 40;
    }

    @Override
    public int getCarbsCount() {
        return 5;
    }

    @Override
    public int getFatsCount() {
        return 8;
    }

    @Override
    public int getMaximumDosePerKg() {
        return -1;
    }
}
