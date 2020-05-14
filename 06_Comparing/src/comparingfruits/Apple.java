package comparingfruits;

import comparingstudents.mycomparing.CompareInterface;

/**
 *
 * @author janvit
 */
public class Apple implements CompareInterface{
    private String name;
    private int sweetness; //1 nejvetsi

    public Apple(String name, int sweetness) {
        this.name = name;
        this.sweetness = sweetness;
    }

    @Override
    public String toString() {
        return "Apple{" + "name=" + name + ", sweetness=" + sweetness + '}';
    }

    @Override
    public boolean isBigger(CompareInterface o) {
        return this.sweetness < ((Apple)o).sweetness;
    }
}
