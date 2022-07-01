package No2;

public class Snake extends Animal{
    private int length;

    public Snake(String name, int weight, int length) {
        super(name, weight);
        this.length = length;
    }

    public Snake(String name, int weight) {
        super(name, weight);
        this.length = length;
    }
    public int getLength() {
        return length;
    }

    public void changeLength(int length) {
        this.length = length;
    }
}
