package Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;


public class GuestList {
    public static void main(String[] args) {

        List<String> guestList = new ArrayList<>();

        while (true) {
            String name = stringInput("Enter name of the guest or enter to quit");

            if (name.isEmpty()) {
                break;
            }

            if (containsIgnoreCase(guestList, name)) {
                System.out.println("You already added " + name);
            } else {
                guestList.add(name);
                System.out.println("Adding " + name + " to list");
            }
        }

        Collections.sort(guestList);

        printGuestNames(guestList);

        // remove guests from list if needed

        while (yesNoInput("Do you want to remove any guests")) {
            System.out.println("Here are all the guests");
            printGuestNames(guestList);

            if (guestList.isEmpty()) {
                System.out.println("There are no guests to remove");
                break;
            }
            int index = positiveIntInput("Enter the number of the guests to remove");
            index--;
            if (index < guestList.size()) {
                String removedGuest = guestList.remove(index);
                System.out.println("Removed guest " + removedGuest);
            } else {
                System.out.println("Error - please enter a valid number of a guests");
            }
        }

        printGuestNames(guestList);
        System.out.println("The number of guests in the guest list is " + guestList.size());

        selectPrizeWinner(guestList);
    }

    public static void selectPrizeWinner(List<String> guests) {

        if (guests.isEmpty()) {
            System.out.println("Warning - no guests - no one to win the prize");
            return;
        }

        Random rng = new Random();
        int randomGuestIndex = rng.nextInt(guests.size());

        String prizeWinner = guests.get(randomGuestIndex);

        System.out.println("Guest number " + (randomGuestIndex+1) + " "
                + prizeWinner + " wins a prize!");
    }


    public static void printGuestNames(List<String> guests) {

        System.out.println("Your guest list is: \n");

        if (guests.isEmpty()) {
            System.out.println("There are no guests in the list");
        } else {
            for (int i = 0; i < guests.size(); i++) {
                System.out.println((i + 1) + ": " + guests.get(i));
            }
        }
    }

    public static boolean containsIgnoreCase(List<String> list, String data) {
        for (String item: list) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }

        return false;
    }
}
