package Section_7.CE39_Polymorphism;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> brake()";
    }

}
