package edu.guilford;

public class Rational {
    
    // attributes
    private int numerator;
    private int denominator;

    // constructors
    // Write a constructor that takes no arguments, and sets the numerator and denominator to a random integer between -100 and 100, 
    // excluding 0 for the denominator
    public Rational() {
        numerator = (int) (Math.random() * 201) - 100;
        denominator = (int) (Math.random() * 201) - 100;
        // warning for if this constructor is called with a denominator of 0
        while (denominator == 0) {
            System.out.println("Warning: denominator cannot be 0");
            denominator = (int) (Math.random() * 201) - 100;
        }
    }

    // Write a second constructor that takes two arguments
    public Rational(int numerator, int denominator) {
        // warning for if this constructor is called with a denominator of 0
        if (denominator == 0) {
            System.out.println("Warning: denominator cannot be 0");
            System.exit(0);
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }


    // toString
    public String toString() {
        return numerator + "/" + denominator;
    }

    // method called negate that reverses the sign the rational number
    // the return type is void because the method does not need to return a value, since it is just modifying the value of the attributes, set by the constructor
    public void negate() {
        numerator = -numerator;
    }

    // method called invert that swaps the numerator and denominator
    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    // method called toDouble that returns a double floating point value of the rational number
    public double toDouble() {
        return (double) numerator / denominator;

    }

    // use the Euclidean algorithm to find the greatest common divisor of the numerator and denominator
    public int gcd() {
        int a = numerator;
        int b = denominator;
        int remainder = a % b;
        while (remainder != 0) {
            a = b;
            b = remainder;
            remainder = a % b;
        }
        return b;
    }

    // method called reduce that reduces the rational number to lowest terms
    public void reduce() {
        int gcd = gcd();
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    // method called add that takes a Rational as an argument and adds it to the current rational number
    public void add(Rational r) {
        numerator = numerator * r.denominator + r.numerator * denominator;
        denominator = denominator * r.denominator;
        reduce();
    }

    
}
