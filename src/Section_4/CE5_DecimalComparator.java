package Section_4;

public class CE5_DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int check1 = (int) (num1 * 1000), check2 = (int) (num2 * 1000);
        return  check1 == check2;
    }

}
