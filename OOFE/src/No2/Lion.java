package No2;

public class Lion extends Animal {
    private int meatConsumption;

    // methods
    public Lion(String name, int weight, int meatConsumption) {
        super(name,weight); // parent constructor
        this.meatConsumption = meatConsumption;
    }

    public Lion(String name, int weight) {
        super(name,weight); // parent constructor

    }

    public int getMeatConsumption() {
        return meatConsumption;
    }

    public void changeMeatConsumption(int meatConsumption) {
        this.meatConsumption = meatConsumption;
    }
}
