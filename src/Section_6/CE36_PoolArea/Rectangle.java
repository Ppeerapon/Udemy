package Section_6.CE36_PoolArea;

public class Rectangle {

    private double width, length;

    public Rectangle(double width, double length) {
        if (width < 0) width = 0;
        if (length < 0) length = 0;
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return  width*length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

}
