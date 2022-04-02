package Section_4;

public class CE8_AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) return -1.0;
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) return -1.0;
        return x * y;
    }

}
