package Section_5;

public class CE16_FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if (number < 0) return -1;
        int firstDigit = 0, lastDigit = number % 10;

        do {
            if (number > 9) number /= 10;
            firstDigit = number;
        } while (number > 9);

        System.out.println(firstDigit + " " + lastDigit);
        return firstDigit + lastDigit;
    }

}
