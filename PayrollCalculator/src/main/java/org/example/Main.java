package org.example;

public class Main {
    public static void main(String[] args) {

        Calculations.data();
        if (Calculations.hoursWorked <= 40) {
            Calculations.noOvertime();
        } else {
            Calculations.yesOvertime();
        }
    }

}