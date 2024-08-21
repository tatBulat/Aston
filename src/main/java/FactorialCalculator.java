public class FactorialCalculator {
    public int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не должно быть отрицательным");
        }
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
