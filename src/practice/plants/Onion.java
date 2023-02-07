package practice.plants;

import practice.food.Eatable;

public class Onion extends Plant implements Eatable {

    @Override
    int getSellingPrice() {
        return getAcquisitionPrice() * 2;
    }

    @Override
    public int getKcal(){
        return 12;
    }

    @Override
    public int getProteinCount() {
        return 0;
    }

    @Override
    public int getCarbsCount() {
        return 1;
    }

    @Override
    public int getFatsCount() {
        return 0;
    }

    @Override
    public int getMaximumDosePerKg() {
        return -1;
    }
}
