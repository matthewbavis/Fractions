import java.util.*;
/**
 * Write a description of class Fraction here.
 *
 * @author Matthew Bavis
 * @version April 2, 2017
 */
public class Fraction
{
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int inNum, int inDenom) {
        numerator = inNum;
        denominator = inDenom;
    }

    /*
    public void simplify() {
        for (int i = 10; i > 1; i--) {
            while (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }
    }
    */

    public void simplify() {
        for (int i = 2; i < 8; i++) {
            if (i == 2 || i == 3 || i == 5 || i == 7) {
                while (numerator % i == 0 && denominator % i == 0) {
                    numerator /= i;
                    denominator /= i;
                }
            }
        }
    }

    public void sameDenominator(Fraction f1, Fraction f2) {
        int f1Denom = f1.denominator;
        int f2Denom = f2.denominator;
        f1.numerator *= f2Denom;
        f1.denominator *= f2Denom;
        f2.numerator *= f1Denom;
        f2.denominator *= f1Denom;
    }

    public Fraction add(Fraction inFraction) {
        int num, denom;
        this.simplify();
        inFraction.simplify();

        if (this.denominator == inFraction.denominator) {
            num = this.numerator + inFraction.numerator;
            denom = this.denominator;
        } else {
            sameDenominator(this,inFraction);
            num = this.numerator + inFraction.numerator;
            denom = this.denominator;
        }

        Fraction sum = new Fraction(num,denom);
        sum.simplify();
        return sum;
    }

    public Fraction subtract(Fraction inFraction) {
        int num, denom;
        this.simplify();
        inFraction.simplify();

        if (this.denominator == inFraction.denominator) {
            num = this.numerator - inFraction.numerator;
            denom = this.denominator;
        } else {
            sameDenominator(this,inFraction);
            num = this.numerator - inFraction.numerator;
            denom = this.denominator;
        }

        Fraction difference = new Fraction(num,denom);
        difference.simplify();
        return difference;
    }

    public Fraction multiply(Fraction inFraction) {
        Fraction product = new Fraction(this.numerator*inFraction.numerator,this.denominator*inFraction.denominator);
        product.simplify();
        return product;
    }

    public Fraction divide(Fraction inFraction) {
        Fraction quotient = new Fraction(this.numerator*inFraction.denominator,this.denominator*inFraction.numerator);
        quotient.simplify();
        return quotient;
    }

    public int compareTo(Fraction inFraction) {
        double d1 = this.decimalValue();
        double d2 = inFraction.decimalValue();

        if (d1 > d2) {
            return 1;
        } else if (d1 < d2) {
            return -1;
        } else if (d1 == d2) {
            return 0;
        }

        return 0;
    }

    public boolean equals(Fraction inFraction) {
        if (this.compareTo(inFraction) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public double decimalValue() {
        return (double)(this.numerator) / (double)(this.denominator);
    }

    public static Fraction randomFraction() {
        int denominator = (int)((Math.random()*100)+1);
        int numerator = (int)((Math.random()*denominator));
        Fraction f1 = new Fraction(numerator,denominator);
        return f1;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
