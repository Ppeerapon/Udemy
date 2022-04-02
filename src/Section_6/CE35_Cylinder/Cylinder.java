package Section_6.CE35_Cylinder;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) height = 0;
        this.height = height;
    }

    public double getVolume() {
        return height * getArea();
    }

    public double getHeight() {
        return height;
    }

}
