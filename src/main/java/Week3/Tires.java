package Week3;

import static input.InputUtils.*;

public class Tires {
    public static void main(String[] args) {

        int numberOfTiresToCompare = positiveIntInput("Enter number of tires: ");
        String[] tireReports = new String[numberOfTiresToCompare];

        for (int t = 0 ; t < numberOfTiresToCompare ; t++) {
            String report = getTireInfo();
            // System.out.println(report);
            tireReports[t] = report;
        }

        printReportTable(tireReports);

    }

    private static void printReportTable(String[] tireReports) {
        for (String tireReport : tireReports) {
            System.out.println(tireReport);
        }
    }

    public static String getTireInfo() {
        String tireName = stringInput("Enter name of tire");
        double price = doubleInput("Enter price for " + tireName);
        double miles = doubleInput("Enter warranty miles for " + tireName);
        double pricePerThousandMiles = price / miles * 1000;
        return ("The " + tireName + " tire costs $" +
                pricePerThousandMiles + " dollars per miles");


    }
}
