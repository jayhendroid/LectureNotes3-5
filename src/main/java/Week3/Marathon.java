package Week3;

import java.sql.SQLOutput;

public class Marathon {
    public static void main(String[] args) {

        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.20; //used to increase by 10%

        marathonSchedule(currentDistance, targetDistance, percentIncrease);
    }

        public static void marathonSchedule(double currentDistance, double targetDistance, double percentIncrease) {
        int week = 1;
        // loop until the current distance greater than the target distant
        // the loop will count the number of weeks
        while (currentDistance < targetDistance) {
            System.out.println(week + " " + currentDistance);
            currentDistance = currentDistance * percentIncrease;
             // count the number weeks
        }
        // need to print the distance
        System.out.println(week + " " + currentDistance);
    }
}
