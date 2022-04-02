package Section_5;

public class CE26_DiagonalStar {

    public static void printSquareStar(int number){
        if (number < 5) System.out.println("Invalid Value");
        else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || j == 1 ||i == number || j == number) System.out.print("*");
                    else if (i == j) System.out.print("*");
                    else if ((number - i) + 1 == j) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }

}
