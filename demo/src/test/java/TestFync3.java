
import static org.junit.Assert.*;

import org.junit.Test;
public class TestFync3 {
    @Test(expected = ArithmeticException.class)
    public void testFunc3First() {
        demo.src.main.java.com.example.Main.func3(5);
    }
    @Test(expected = ArithmeticException.class)
    public void testFunc3Second() {
        demo.src.main.java.com.example.Main.func3(0);
    }
}