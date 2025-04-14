package org.example;

public class Main {
    public static void main(String[] args) {

        // INSTANCE VARIABLES
        // They are different for every instance of an object
        // Creating an object
        Calculator myCalculator = new Calculator();
        myCalculator.brand = "TI-84";

        Calculator myFriendsCalculator = new Calculator();
        myFriendsCalculator.brand = "TI-84";

        // I don't have to create  certain type of calculator
        double resultAdd = Calculator.add(23, 24);
        System.out.println("Result of addition: " + resultAdd + "\n");

        GameManager.exitGame();
        GameManager.exitWithError("Game was not saved: Insufficient memory.");

        double resultSubtraction = Calculator.subtraction(23,24);
        System.out.println("Result of subtraction: " + resultSubtraction);
    }

}