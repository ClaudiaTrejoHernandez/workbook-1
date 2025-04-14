package org.example;

public class Calculator {


    public String brand;
    public double num1;
    public double num2;


    // Methods: What can a calculator do?
    public void Add(){
        System.out.println("Doing addition");
        double result = this.num1 + this.num2;
    }
    public void Subtract(){
        System.out.println("Subtracting");
    }

    // Void means the method does not return a result.. outside of the method

    //  Static method does not need object data, can be used always
    public static double add(double _numberA, double _numberB) {
        return _numberA + _numberB;
    }

    public static double subtraction(double _numberA, double _numberB){
        return _numberA - _numberB;
    }

    // Addition, Subtraction, Multiplication
    // Formulas
}
