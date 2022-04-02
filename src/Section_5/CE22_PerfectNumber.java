package Section_5;

public class CE22_PerfectNumber {

    public static boolean isPerfectNumber(int number){
        if (number < 1) return false;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        System.out.println(sum + " " + number);
        return (sum == number);
    }

}
