package practice.generics;

import java.util.ArrayList;
import java.util.List;

public class VegetablesGarden implements Garden<Vegetable>{

    public List<Vegetable> vegetables = new ArrayList<>();

    @Override
    public void addElement(Vegetable element) {
        vegetables.add(element);
    }

    @Override
    public Vegetable hardestToCareFor(){
        Vegetable mostDifficult = vegetables.get(0);
        for(Vegetable v : vegetables){
            if(v.getDifficultyLevel() > mostDifficult.getDifficultyLevel()){
                mostDifficult = v;
            }
        }
        return mostDifficult;
    }
}
