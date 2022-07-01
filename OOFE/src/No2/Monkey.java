package No2;

public class Monkey extends Animal{
    private String favFood;

    public Monkey(String name, int weight, String favFood) {
        super(name, weight);
        this.favFood = favFood;
    }
    public Monkey(String name, int weight) {
        super(name, weight);

    }


    public String getFavFood() {
        return favFood;
    }

    public void changeFavFood(String favFood) {
        this.favFood = favFood;
    }
}
