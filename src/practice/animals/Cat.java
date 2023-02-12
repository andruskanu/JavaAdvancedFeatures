package practice.animals;

public class Cat extends Animal{

    @Override
    public String makeSound(){

        System.out.println(getDefaultLocation());

        return "Miau";
    }
}
