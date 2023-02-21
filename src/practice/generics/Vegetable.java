package practice.generics;

public class Vegetable {

    private int difficultyLevel;
    private String name;

    public Vegetable(int difficultyLevel, String name) {
        this.difficultyLevel = difficultyLevel;
        this.name = name;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
