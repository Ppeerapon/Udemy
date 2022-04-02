package Section_5;

public class CE20_GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int num1, int num2){
        if (num1 < 10 || num2 < 10) return -1;
        int commonDivisor = -1;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) if (num2 % i == 0) commonDivisor = i;
        }
        return commonDivisor;
    }

}
