package edu.guilford;

public class Rational {
    
    // attributes
    private int numerator;
    private int denominator;

    // constructors
    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    // Write a second constructor that takes two arguments
    public Rational(int numerator, int denominator) {
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
    // the return type is int because the method returns an integer value
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
