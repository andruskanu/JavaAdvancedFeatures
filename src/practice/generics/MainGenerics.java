package practice.generics;

public class MainGenerics {

    public static void main(String[] args) {

        VegetablesGarden vegetablesGarden = new VegetablesGarden();

        vegetablesGarden.addElement(new Vegetable(5, "Carrot"));
        vegetablesGarden.addElement(new Vegetable(7, "Potato"));

        System.out.println(vegetablesGarden.hardestToCareFor().getName());

        Orchard orchard = new Orchard();

        orchard.addElement(new Tree(10,"Oak"));
        orchard.addElement(new Tree(8,"Ginkgo"));

        System.out.println(orchard.hardestToCareFor().name);
    }
}
