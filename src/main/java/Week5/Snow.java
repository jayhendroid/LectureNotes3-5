package Week5;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class Snow {
    public static void main(String[] args) {

        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 5.2);
        snowfall.put("December", 13.7);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

        System.out.println(snowfall);

        for (String month: snowfall.keySet()) {
            double snow = snowfall.get(month);
            System.out.printf("The snow in %s was %.2f in inches\n", month, snow);
        }

        snowfall.put("February", 10.3);

        System.out.println(snowfall);

        System.out.println("The snow in January is " + snowfall.get("January") + " inches");

        System.out.println("The snow in July is " + snowfall.get("July") + " inches");

        if (snowfall.containsKey("July")) {
            System.out.println("There was snow in July!");
        } else {
            System.out.println("There was no snow in July!");
        }

        String newMonth = stringInput("Enter name of month");
        double newSnow = positiveDoubleInput("Enter amount of snow for " + newMonth);

        snowfall.put(newMonth, newSnow);

        System.out.println(snowfall);

        Double snow = snowfall.get(newMonth);

        if (snow != null) {
            // ask if should overwrite

            System.out.println("The hashmap already contaiins that month, " + newMonth + " snow = " + snow + " inches");
            boolean overwrite = yesNoInput("Overwrite data?");
            if (overwrite) {
                snowfall.put(newMonth, newSnow);
            } else {
                System.out.println("Data was not added");
            }
        } else {
            snowfall.put(newMonth, newSnow);
        }

        System.out.println(snowfall);

    }
}
