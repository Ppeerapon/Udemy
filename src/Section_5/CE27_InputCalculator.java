package Section_5;

import java.util.Scanner;

public class CE27_InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        long avg;
        while (true){
            if (scanner.hasNextInt()){
                int num = scanner.nextInt();
                sum += num;
                count += 1;
            } else {
                break;
            }
        }
        avg = Math.round((float)sum/count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }

}
