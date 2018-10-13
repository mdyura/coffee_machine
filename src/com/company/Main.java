package com.company;

import java.util.Scanner;

public class Main {

    // public static int m; // water
    public static int power;
    public static int m = 0;


    public static void main(String[] args) {

        System.out.println("Hi! Can I make you a coffee?");
        setPower();
        setWater();
        System.out.println("Everything is ready. Do you want to make coffee?");
        turnOn();
        System.out.println("Brewing............");
        time();
    }


    public static void setPower() {
        System.out.println("Please, set the power of the coffee machine: ");
        Scanner pow = new Scanner(System.in);
        while (!pow.hasNextInt()){
            System.out.println("I need a number.");
            pow.nextLine();
        }
        power = pow.nextInt();
        System.out.println("The power is " + power);
    }
    public static void setWater() {
        if (m == 0) {
            System.out.println("You need to fill some water. How much water do you want to fill?");
            Scanner w = new Scanner(System.in);
            while(!w.hasNextInt())
            {
                System.out.println("I need a number.");
                w.nextLine();
            }
            m = w.nextInt();

        }
        System.out.println("Well done. You filled " + m + "  ml of water.");
    }

    public static void turnOn() {
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Yes. Any other digit to exit.");

        while (!in.hasNextInt()) {
            System.out.println("I need a digit. 1 to turn on, any other to turn exit.");
            in.nextLine();
        }
        int a = in.nextInt();

        if (a != 1) {
            System.out.println("Goodbye.");
            System.exit(0);
        }
    }


    public static void time() {
        int c = 4200;
        int t = 80;
        int time = (c * m * t) / power;
        System.out.println("Coffee is ready. Have a nice day. Bye.");
        System.out.println("The time of brewing coffee is " + time + " seconds, or " + time / 60 + " minutes.");
    }



    }






