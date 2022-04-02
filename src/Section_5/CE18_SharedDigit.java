package Section_5;

public class CE18_SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2){
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) return false;

        String num2String = "" + num2;
        while (num1 > 0){
            int lastDigit = num1 % 10;
            if (num2String.contains("" + lastDigit)) return true;
            num1 -= lastDigit;
            num1 /= 10;
        }

        return false;
    }

}
