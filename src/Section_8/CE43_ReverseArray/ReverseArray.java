package Section_8.CE43_ReverseArray;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {
        int[] reverseArray = array.clone();
        reverseArray[0] = 5;
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reversed array = " + Arrays.toString(reverseArray));
    }

}
