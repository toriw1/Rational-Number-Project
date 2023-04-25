package edu.guilford;

/**
 * Hello world!
 *
 */
public class RationalNumber 
{
    public static void main( String[] args )
    {

    // test the Rational constructor with no parameters and toString()
    Rational r1 = new Rational();
    System.out.println("r1 = " + r1.toString());

    // test the Rational constructor with two parameters and toString()
    Rational r2 = new Rational(6, 12);
    System.out.println("r2 = " + r2);

    // use and print the negate method
    r2.negate();
    System.out.println("r2 negatated = " + r2);

    // return r2 to its original value
    r2.negate();

    // use and print the invert method
    r2.invert();
    System.out.println("r2 inverted = " + r2);

    // return r2 to its original value
    r2.invert();

    // use and print the toDouble method
    System.out.println("r2 as a double = " + r2.toDouble());

    // use and print the gcd method (to test it)
    // System.out.println("gcd of r2 = " + r2.gcd());

    // use and print the reduce method
    r2.reduce();
    System.out.println("r2 reduced = " + r2);

    // use and print the add method
    Rational r3 = new Rational(3, 4);
    r3.add(r2);
    System.out.println("r2 + r3 = " + r3);

    // find the gcd of r3 and print it
    // System.out.println("gcd of r3 = " + r3.gcd());



    }
}
