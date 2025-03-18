package Week3;

import static input.InputUtils.doubleInput;

public class Squares {

    // this is the main method - the first code to run
    public static void main(String[] args) {
    //    double number = doubleInput("Please enter a number and I'll sqaure it");
    //    square(number);

        for (int x=1; x<=10 ; x++) {
            double s = square(x);
            System.out.println("the square of " + x + " is " + s);
        }
    }         // this is the end of the main method



    // this method takes one argument. a number
    // it calculates the square of that number (by multiplying it by itself
    // and prints the number and its square value
    public static double square(double n) {
        double sq = n *n; // the square of a number that is multiplied by itself
        return sq;
    }
}
