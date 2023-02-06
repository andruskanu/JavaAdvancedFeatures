package oopconcepts.plants;

public class Cactus extends Plant{

    public Cactus(String name, int acquisitionPrice) {
        this.setName(name);
        this.setAcquisitionPrice(acquisitionPrice);
    }

    @Override
    public int getSellingPrice() {
        return getAcquisitionPrice() * 4;
    }
}
