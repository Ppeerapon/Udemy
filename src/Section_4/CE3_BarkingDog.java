package Section_4;

public class CE3_BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) return false;

        if (barking) {
            return hourOfDay < 8 || hourOfDay > 22;
        }

        return false;

    }

}
