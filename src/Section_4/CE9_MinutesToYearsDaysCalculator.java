package Section_4;

public class CE9_MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) System.out.println("Invalid Value");
        else {
            long year = ((minutes/60)/24)/365, day = ((minutes/60)/24)%365;
            String yearsAndDays = String.format("%d min = %d y and %d d",minutes , year, day);
            System.out.println(yearsAndDays);
        }
    }

}
