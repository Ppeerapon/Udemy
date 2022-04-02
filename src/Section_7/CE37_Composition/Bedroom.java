package Section_7.CE37_Composition;

public class Bedroom {

    private String name;
    private Bed bed;
    private Ceiling ceiling;
    private Lamp lamp;
    private Wall wall1, wall2, wall3, wall4;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.bed = bed;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed | ");
        bed.make();
    }

    public Lamp getLamp() {
        return lamp;
    }

}
