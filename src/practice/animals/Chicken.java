package practice.animals;

import practice.food.Eatable;

public class Chicken extends Animal implements Eatable {

    @Override
    public String makeSound() {
        return "piu piu";
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
