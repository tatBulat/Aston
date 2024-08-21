import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    @Test
    void testFactorialOfZero() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.factorial(0);
        assertEquals(1, result, "Факториал 0 должен быть равен 1");
    }

    @Test
    void testFactorialOfOne() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.factorial(1);
        assertEquals(1, result, "Факториал 1 должен быть равен 1");
    }

    @Test
    void testFactorialOfPositiveNumber() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.factorial(5);
        assertEquals(120, result, "Факториал 5 должен быть равен 120");
    }

    @Test
    void testFactorialOfLargeNumber() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.factorial(10);
        assertEquals(3628800, result, "Факториал 10 должен быть равен 3628800");
    }
}
