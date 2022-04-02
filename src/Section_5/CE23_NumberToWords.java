package Section_5;

public class CE23_NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        else {
            String word = "";
            int reverseNumber = reverse(number), numDigit = getDigitCount(number), reverseNumDigit = getDigitCount(reverseNumber);
            while (reverseNumber > 0){
                int lastDigit = reverseNumber % 10;
                reverseNumber -= lastDigit;
                reverseNumber /= 10;
                switch (lastDigit){
                    case 0:
                        word += "Zero ";
                        break;
                    case 1:
                        word += "One ";
                        break;
                    case 2:
                        word += "Two ";
                        break;
                    case 3:
                        word += "Three ";
                        break;
                    case 4:
                        word += "Four ";
                        break;
                    case 5:
                        word += "Five ";
                        break;
                    case 6:
                        word += "Six ";
                        break;
                    case 7:
                        word += "Seven ";
                        break;
                    case 8:
                        word += "Eight ";
                        break;
                    case 9:
                        word += "Nine ";
                        break;
                }
            }
            if (numDigit != reverseNumDigit){
                int moreZero = numDigit - reverseNumDigit;
                for (int i = 0; i < moreZero; i++) {
                    word += "Zero ";
                }
            }
            if (number == 0) System.out.println("Zero");
            else System.out.println(word);
        }
    }

    public static int reverse(int number){
        String test = "" + number;
        int reverseNumber = 0, numberBF = number;
        while (number != 0){
            int lastDigit = number % 10;
            number -= lastDigit;
            number /= 10;
            if (reverseNumber != 0) reverseNumber *= 10;
            reverseNumber += lastDigit;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number){
        if (number < 0) return -1;
        return Integer.toString(number).length();
    }

}
