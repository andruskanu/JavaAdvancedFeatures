package practice.plants;

public abstract class Plant {

    private String family;
    private String name;
    private int acquisitionPrice;
    private boolean isRare;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcquisitionPrice() {
        return acquisitionPrice;
    }

    public void setAcquisitionPrice(int acquisitionPrice) {
        this.acquisitionPrice = acquisitionPrice;
    }

    public boolean isRare() {
        return isRare;
    }

    public void setRare(boolean rare) {
        isRare = rare;
    }

    public String getPlantInfo() {
        return name + " with an acquisition cost of " + acquisitionPrice;
    }

    abstract int getSellingPrice();
}
