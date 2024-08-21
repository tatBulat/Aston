import static org.testng.Assert.*;
import org.testng.Assert;

public class FactorialCalculatorTest {

    @org.testng.annotations.Test
    public void testFactorialOfZero() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.factorial(0);
        Assert.assertEquals(result, 1, "Факториал 0 должен быть равен 1");
    }
    @org.testng.annotations.Test
    public void testFactorialOfOne() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.factorial(1);
        Assert.assertEquals(result, 1, "Факториал 1 должен быть равен 1");
    }

    @org.testng.annotations.Test
    public void testFactorialOfPositiveNumber() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.factorial(5);
        Assert.assertEquals(result, 120, "Факториал 5 должен быть равен 120");
    }

    @org.testng.annotations.Test
    public void testFactorialOfLargeNumber() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.factorial(10);
        Assert.assertEquals(result, 3628800, "Факториал 10 должен быть равен 3628800");
    }
}
