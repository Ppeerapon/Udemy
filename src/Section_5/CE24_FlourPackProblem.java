package Section_5;

public class CE24_FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        while (goal >= 5 && bigCount > 0){
            goal -= 5;
            bigCount -= 1;
        }
        return goal - smallCount <= 0;
    }

}
