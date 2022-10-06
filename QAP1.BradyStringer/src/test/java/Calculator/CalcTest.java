package Calculator;

import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {
    Calculator calcTest = new Calculator();
    @Test
    public void assertAddEquals(){
        Assertions.assertNotEquals(4, calcTest.add(6,2));
    }

    @Test
    public void assertMultiplyEquals(){
        Assertions.assertNotEquals(4, calcTest.multiply(4, 3));
    }

    @Test
    public void assertDivideEquals(){
        Assertions.assertNotEquals(4, calcTest.divide(12,3));
    }

    @Test
    public void assertSubtractEquals(){
        Assertions.assertNotEquals(4, calcTest.subtract(13,6));
    }
}
