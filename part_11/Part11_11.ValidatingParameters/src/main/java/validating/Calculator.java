package validating;

public class Calculator {

    public int factorial(int num) {

        if (num < 0) {
            throw new IllegalArgumentException("num can't be a negative number.");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {

        if (subsetSize < 0 || subsetSize > setSize) {
            throw new IllegalArgumentException("setSize and subsetSize should be non-negative and subsetSize does not exceed the setSize");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
