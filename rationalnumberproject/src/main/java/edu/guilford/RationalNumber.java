package edu.guilford;

/**
 * Hello world!
 *
 */
public class RationalNumber 
{
    public static void main( String[] args )
    {

    // test the Rational constructor with no parameters which sets random values, and toString()
    Rational r1 = new Rational();
    System.out.println("The value of rational number 1: " + r1.toString());

    // test the Rational constructor with two parameters
    Rational r2 = new Rational(6, 12);
    System.out.println("\nThe value of rational number 2: " + r2);

    // use and print the negate method
    r2.negate();
    System.out.println("\nTesting negate method");
    System.out.println("Input Value: 6/12");
    System.out.println("Expected Value: -6/12");
    System.out.println("Rational Number 2 with the opposite sign: " + r2);

    // return r2 to its original value
    r2.negate();

    // use and print the invert method
    r2.invert();
    System.out.println("\nTesting invert method");
    System.out.println("Input Value: 6/12");
    System.out.println("Expected Value: 12/6");
    System.out.println("Rational Number 2 inverted: " + r2);

    // return r1 to its original value
    r2.invert();

    // use and print the toDouble method
    System.out.println("\nTesting toDouble method");
    System.out.println("Input Value: 6/12");
    System.out.println("Expected Value: 0.5");
    System.out.println("Rational Number 2 as a double: " + r2.toDouble());

    // use and print the gcd method (to test it)
    System.out.println("\nTesting GCD method");
    System.out.println("Input Value: 6/12");
    System.out.println("Expected Value: 6");
    System.out.println("GCD of Rational Number 2: " + r2.gcd());

    // use and print the reduce method
    r2.reduce();
    System.out.println("\nTesting reduce method");
    System.out.println("Input Value: 6/12");
    System.out.println("Expected Value: 1/2");
    System.out.println("Rational Number 2 reduced: " + r2);

    // use and print the add method
    Rational r3 = new Rational(3, 4);
    System.out.println("\nTesting add method");
    System.out.println("Value of Rational Number 2: " + r2 + "\nValue of Rational Number 3: " + r3);
    r3.add(r2);
    System.out.println("Expected Value: 5/4");
    System.out.println("The sum of Rational Number 2 and Rational Number 3: " + r3);

    // find the gcd of r3 and print it to check the add method
    System.out.println("The GCD of the sum = " + r3.gcd());

    // testing the While statement warning for a denominator of 0
    System.out.println("\nTesting the While statement warning for a denominator of 0");
    System.out.println("Input: 1/0");
    Rational r4 = new Rational(1, 0);
    System.out.println("Value of Rational Number 4: " + r4);

    }
}
