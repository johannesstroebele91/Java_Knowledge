package de.hdm_stuttgart.mi.Functions;

import java.util.Random;

public class MathFunctions {

    public static void main(String[] args) {

        // https://introcs.cs.princeton.edu/java/11cheatsheet/

        int a = 4;
        int b = -7;
        double c = 2.48339;

        // Constant Math Field Values
        double e; // value of e (constant)
        double PI; // value of π
        double radius = 5.39;
        System.out.println("A circle of radius " + radius + " will cover an area of " + (float)(Math.round(Math.PI * radius * radius*100))/100);

        // Math.abs() -> Betrag: damit auf jedenfall Differenz gebildet wird
        System.out.println("Math.abs(b) " + Math.abs(a) );
        System.out.println("Math.abs(a-b) " + Math.abs(a-b) );
        System.out.println("Dasselbe Ergebnis bei Math.abs(b-a) " + Math.abs(b-a) );


        // Math.max()
        System.out.println( "Math.max(a,b)" + Math.max(a, b));

        // Math.min()
        System.out.println( "Math.min(a,b)" + Math.min(a, b));

        // Math.round()
        System.out.println( "Math.round" + Math.round(c));
        System.out.print( "Für 2 Nachkommastellen: ((double) Math.round((c*100)))/100");
        System.out.println(((double) Math.round((c*100)))/100 + "\n");

        // Math.pow -> hoch
        System.out.println("Math.pow(a, a) " + Math.pow(a, a));
        for (int i = 0; i < 5; i++) {
            System.out.println( "Math.pow(10, " + i + ") "+ (int) Math.pow(10, i));
        }

        // Math.sqrt () -> wurzel
        System.out.println( "Math.sqrt(a) " + Math.sqrt(a) );

        // Math.random()
        double randomNumber = Math.random(); // Random number is always double
        System.out.println( "Math.random() " + Math.random() ); // Output: 0.053428923789123

        // Creating a random value between 0 and 10 (inclusive)
        // 1) Short solution using  "Random Class"
        int randomValue =  new Random().nextInt(10); //
        System.out.println("int randomValue =  new Random().nextInt(10) " + randomValue);

        // 2) Long solution using manual
            // define the range
            int max = 3;
            int min = 1;
            int range = max - min + 1;
            for (int i = 0; i < 5; i++) {
                int rand = (int)(Math.random() * range) + min;
                System.out.println("Rand " + rand); // Output is different everytime this code is executed
            }

        // Meth.exp(double a)
        // returns Euler's number e raised to the power of a double value

        // Other
        // Math.sin(), Math.cos(), Math.tan()



    }
}
