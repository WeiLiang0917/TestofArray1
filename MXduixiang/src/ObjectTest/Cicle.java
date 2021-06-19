package ObjectTest;

import java.util.Objects;

/**
 * @author WeiLiang
 * @date 2021/6/15 - 18:20
 */
public class Cicle extends GeometricObject{
    private  double radius;



    public Cicle() {
    }
    public Cicle(double radius) {
        this.radius = radius;
    }
    public Cicle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cicle cicle = (Cicle) o;
        return Double.compare(cicle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Cicle{" +
                "radius=" + radius +
                '}';
    }
}
