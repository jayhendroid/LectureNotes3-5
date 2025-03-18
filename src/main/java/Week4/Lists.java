package Week4;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Jacob");
        arrayList.add("MCTC");

        String firstWord = arrayList.get(0);

        for (String s: arrayList) {
            System.out.println(s);
            System.out.println(s.toUpperCase());
        }

        System.out.println(arrayList);
    }
}
