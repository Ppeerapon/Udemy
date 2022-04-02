package Section_5;

public class CE15_NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverseNumber = 0, num = number;
        while (num != 0){
            int lastDigit = num % 10;
            num -= lastDigit;
            num /= 10;
            reverseNumber *= 10;
            reverseNumber += lastDigit;
        }
        System.out.println(number + " || " + reverseNumber);
        return number == reverseNumber;
    }

}
