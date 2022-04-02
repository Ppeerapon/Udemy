package Section_5;

public class CE25_LargestPrime {

    public static int getLargestPrime(int number){
        int prime = -1;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0){
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) prime = i;
            }
        }
        return prime;
    }

}
