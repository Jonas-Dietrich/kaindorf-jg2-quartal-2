package bl;

public class EulerBL {

    public static int solveMultiplesOf3And5() {
        int result = 0;

        for (int i  = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }

        return result;
    }

    public static int solveSpecialPythagoreanTriplet() {
        int result = 0;

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                
            }
        }
        return result;
    }

    public static int solveFactorialDigitSum() {
        int result = 100;

        for (int i = 99; i > 0 ; i--) {
            i *= i;
        }

        return result;
    }

    public static int solveLexicographicPermutations() {
        int result = 0;

        return result;
    }
}
