package oopconcepts.plants;

public class PlantsMain {

    public static void main(String[] args) {

        Ficus f1 = new Ficus("Ficus Pallida", 28);
        Rose r1 = new Rose("Wild Rose", 12);
        Cactus c1 = new Cactus("Saguaro", 33);

        System.out.println(f1.getPlantInfo() + " with a selling price " + f1.getSellingPrice());
        System.out.println(r1.getPlantInfo() + " with a selling price " + r1.getSellingPrice());
        System.out.println(c1.getPlantInfo() + " with a selling price " + c1.getSellingPrice());

    }
}
