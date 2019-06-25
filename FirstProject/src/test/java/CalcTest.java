import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

    private Calc calc = new Calc();

    @Test
    public void testSum() throws Exception {
        Assert.assertEquals(5, calc.sum(2,3));

    }
    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(7, calc.subtract(10,3));

    }
    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(6, calc.multiply(2,3));

    }
    @Test
    public void testDivision() throws Exception {
        Assert.assertEquals(2, calc.division(10,5));

    }
}
