package oopconcepts.plants;

public class Rose extends Plant{

    public Rose(String name, int acquisitionPrice) {
        this.setName(name);
        this.setAcquisitionPrice(acquisitionPrice);
    }

    @Override
    public int getSellingPrice() {
        return getAcquisitionPrice() * 3;
    }
}
