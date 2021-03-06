package ObjectTest;

/**
 * @author WeiLiang
 * @date 2021/6/15 - 18:18
 */
public class GeometricObject {
    protected String color="white";
    protected double weight=1.0;

    public GeometricObject() {
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
