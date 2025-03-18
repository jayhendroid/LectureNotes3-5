package Week5;

import java.util.HashMap;
import java.util.Map;

public class ClassCodes {
    public static void main(String[] args) {
        Map<Integer, String> classCodes = new HashMap<>();
        classCodes.put(2545, "Java");
        classCodes.put(2546, "Python");
        classCodes.put(2547, "C#");
        classCodes.put(2417, "Android");

        for (Integer classCode: classCodes.keySet()) {
            String className = classCodes.get(classCode);
            System.out.println("ITEC " + classCode + " " + className);
        }

        System.out.println("I am taking " + classCodes.size() + " classes");
        int numberOfClasses = classCodes.size();

        int searchCode = 2417;

        if (classCodes.containsKey(searchCode)) {
            System.out.println("This class is found in the HashMap. The class name is " +
                    classCodes.get(searchCode));
        } else {
            System.out.println(searchCode + " is not found in the HashMap");
        }

        int searchCode2 = 2545;
        String className = classCodes.get(searchCode2);
        if (className == null) {
            System.out.println(searchCode2 + " is not found in the HashMap");
        } else {
            System.out.println(searchCode2 + " is found in the HashMap. The class name is " + className);
        }


    }
}
