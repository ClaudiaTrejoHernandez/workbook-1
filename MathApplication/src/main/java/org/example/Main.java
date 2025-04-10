package org.example;

public class Main {
    public static void main(String[] args) {

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
    }

}


