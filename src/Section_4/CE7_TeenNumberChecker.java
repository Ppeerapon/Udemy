package Section_4;

public class CE7_TeenNumberChecker {

    public static boolean hasTeen(int num1,int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int age) {
        return (13 <= age && age <= 19);
    }

}
