package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Q1:
        double bobSalary = 45000;
        double garySalary = 45500;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("Bob's salary is: $" + bobSalary);
        System.out.println("Gary's salary is: $" + garySalary);
        System.out.println("The  highest salary is: $" + highestSalary);

        System.out.println("");

        //Q2:
        double carPrice = 25000.50;
        double truckPrice = 34200.50;
        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("A car's price is: $" + carPrice);
        System.out.println("A truck's price is: $" + truckPrice);
        System.out.println("The lowest price is: $" + lowestPrice);

        System.out.println("");

        //Q7
        double randomNumber = Math.random();
        System.out.println("Random number between 0 and 1: " + randomNumber);


    }



}


