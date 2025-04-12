package org.example;

public class Saiyan {

    //Properties - instance variables
    //A blueprint of all the information we would store about a Saiyan
    //A description of information
    private String name;
    private int powerLevel;
    private int ki;
    private boolean superSaiyan = false;

    //Constructor (it's a way of designing new Saiyans)
    public Saiyan(String _name, int powerLevel, int ki) {
        this.name = _name;
        this.powerLevel = powerLevel;
        this.ki = ki;
        this.superSaiyan = false; // default value
    }

    //Create a method to display the info -> is always linked to this Object (saiyan). mySaiyan.displayInfo();

    public void displayInfo() {
        System.out.println("==== Saiyan Status ====");
        System.out.println("Name: " + name);
        System.out.println("Power Level: " + powerLevel);
        System.out.println("Ki: " + ki);
        System.out.println("Super Saiyan: " + (superSaiyan ? "Yes" : "No"));
        System.out.println("=======================");
    }

    public void train() {
        System.out.println("=================================== Training ===================================");
        powerLevel += 500;
        ki += 50;
        System.out.println("Remzoku, you've been training real hard! Let's increase your Power Level by 500!!\nYour Power Level is now " + powerLevel + "!!!\n");
        System.out.println("Let's also increase your ki by 50!!\nYour ki is now " + ki + "!!!");
        System.out.println("================================================================================");
    }

    public void transform() {
        if (powerLevel >= 9000 && !superSaiyan) {
            superSaiyan = true;
            powerLevel *= 2;
            System.out.println(this.name + " transformed into a Super Saiyan!!!");
        } else {
            System.out.println(this.name + " is not ready to transform yet :(");
        }

    }


    public void blast(Saiyan enemy) {
        if (this.ki >= 30) {
            this.ki -= 30;            // reduce my own ki
            enemy.ki -= 20;      // damage enemy's ki
            System.out.println(name + " launches a hecka powerful ki BLAST!\n");
            System.out.println(enemy.name + " loses 20 ki!! WHOAA!\n");
        } else {
            System.out.println("Not enough ki juices left to launch a blast :(\n");
        }

    }

    public void compareStrength(Saiyan enemy) {
        int maxPower = Math.max(this.powerLevel, enemy.powerLevel);
        if (maxPower == this.powerLevel && maxPower == enemy.powerLevel) {
            System.out.println("Both Saiyans are equally strong!! It's a tie! ⚖️");
        } else if (maxPower == this.powerLevel) {
            System.out.println("Looks like " + this.name + " is the stronger Saiyan!! 💪");
        } else {
            System.out.println("Looks like " + enemy.name + " is the stronger Saiyan!! 💥");
        }
    }
}


