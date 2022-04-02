package Section_4;

public class CE11_PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer) return  (temperature >= 25 && temperature <= 45);
            else return  (temperature >= 25 && temperature <= 35);
    }

}
