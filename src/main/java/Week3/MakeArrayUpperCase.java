package Week3;

import java.util.Arrays;

public class MakeArrayUpperCase {
    public static void main(String[] args) {

        String[] sponsors = {"ikea", "cvs", "3m"};
        makeArrayUpperCase(sponsors);
        System.out.println(Arrays.toString(sponsors));
    }

    public static void makeArrayUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }
}
