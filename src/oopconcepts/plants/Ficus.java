package oopconcepts.plants;

public class Ficus extends Plant{

    public Ficus(String name, int acquisitionPrice) {
        this.setName(name);
        this.setAcquisitionPrice(acquisitionPrice);
    }

    @Override
    public int getSellingPrice() {
        return getAcquisitionPrice() * 2;
    }
}
