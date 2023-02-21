package practice.generics;

import java.util.Map;
import java.util.TreeMap;

public class Orchard implements Garden<Tree>{

    public Map<Integer, Tree> trees = new TreeMap<>();

    private Tree hardestToCareFor;

    @Override
    public void addElement(Tree element) {
        trees.put(element.difficultyLevel, element);
        if(hardestToCareFor == null){
            hardestToCareFor = element;
        }
        if(element.difficultyLevel > hardestToCareFor.difficultyLevel){
            hardestToCareFor = element;
        }
    }

    @Override
    public Tree hardestToCareFor(){
        return hardestToCareFor;
    }

}
