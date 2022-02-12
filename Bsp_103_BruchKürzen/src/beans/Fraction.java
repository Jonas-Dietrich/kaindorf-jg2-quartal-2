package beans;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void cancel() {
        int a = numerator;
        int b = denominator;

        while (a != b) {
            while (a > b) {
                a = a -b;
            }
            while (b > a) {
                b = b - a;
            }
        }

        this.numerator /= a;
        this.denominator /= a;

    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }


}
