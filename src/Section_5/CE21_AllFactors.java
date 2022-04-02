package Section_5;

public class CE21_AllFactors {

    public static void printFactors(int number){
        if (number < 1) System.out.println("Invalid Value");
        else {
            String factors = "";
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) factors += i + " ";
            }
            System.out.println(factors);
        }
    }

}
