package org.example;

import java.util.Scanner;

public class CostEstimate {
    private Scanner read = new Scanner(System.in);

    // User input
    private String pickupDate;
    private int rentDays;
    private String tollTag;
    private String GPS;
    private String roadsideAssist;
    private int age;

    // Set Prices
    private final double basicRentalRate = 29.99;
    private final double priceTollTag = 3.95;
    private final double priceGPS = 2.95;
    private final double priceRoadsideAssist = 3.95;
    private final double underageCharge = 0.30;

    public void rentalInfo() {
        System.out.print("Enter your pickup date: ");
        pickupDate = read.nextLine();

        System.out.print("Enter the number of days you need your rental: ");
        rentDays = read.nextInt();
        read.nextLine(); // consume leftover newline

        System.out.print("Would you like an electronic toll tag for $3.95/day (Y/N)? ");
        tollTag = read.nextLine();

        System.out.print("Would you like GPS for $2.95/day (Y/N)? ");
        GPS = read.nextLine();

        System.out.print("Would you like roadside assistance for $3.95/day (Y/N)? ");
        roadsideAssist = read.nextLine();

        System.out.print("Enter your current age: ");
        age = read.nextInt();
    }

    public void calculations() {
        double basicRental = basicRentalRate * rentDays;
        double optionsCost = 0.0;

        if (tollTag.equalsIgnoreCase("Y")) {
            optionsCost += priceTollTag * rentDays;
        }
        if (GPS.equalsIgnoreCase("Y")) {
            optionsCost += priceGPS * rentDays;
        }
        if (roadsideAssist.equalsIgnoreCase("Y")) {
            optionsCost += priceRoadsideAssist * rentDays;
        }

        double underageSurcharge = (age < 25) ? basicRental * underageCharge : 0.0;
        double totalCost = basicRental + optionsCost + underageSurcharge;

        System.out.println("\n---------- Rental Car Cost Estimate ----------");
        System.out.println("Pickup Date: " + pickupDate);
        System.out.printf("Basic Car Rental: $%.2f%n", basicRental);
        System.out.printf("Optional Extra Costs: $%.2f%n", optionsCost);
        System.out.printf("Underage Driver Surcharge: $%.2f%n", underageSurcharge);
        System.out.printf("Total Estimated Cost: $%.2f%n", totalCost);
    }
}
