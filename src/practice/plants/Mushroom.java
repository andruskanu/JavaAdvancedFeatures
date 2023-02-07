package practice.plants;

import practice.food.Poisonous;

public class Mushroom implements Poisonous {

    @Override
    public float getDosePerKg() {
        return 100f;
    }

    @Override
    public float getDoseForAdult(int kgAdult) {
        return getDosePerKg() * kgAdult;
    }
}

