package Section_4;

public class CE4_LeapYearCalculator {

    public static boolean  isLeapYear(int year){
        if (!(9999 >= year && year >= 1)) return false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else return true;
        } else return false;
    }

}
