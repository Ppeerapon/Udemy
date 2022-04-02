package Section_7.CE39_Polymorphism;

public class Car {

    private String name;
    private int cylinders, wheels;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

}

