package org.example;
import javax.print.MultiDocPrintService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        CostEstimate estimate = new CostEstimate();
        estimate.rentalInfo();
        estimate.calculations();


//        //In class exercise: Week 2, Tuesday
//        //String customer = "C1000";
//        System.out.println("Enter customer code: ");
//        String customerCode = read.nextLine();
//
//        if (customerCode.startsWith("C")){
//            System.out.println("Good customer code!");
//        }else{
//            System.out.println("Customer code should start with a C");
        }
    }
}