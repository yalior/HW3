import static org.junit.Assert.*;

import org.junit.Test;

import demo.src.main.java.com.example.Main;

public class TestFync2 {
        @Test
    public void testFunc2Firtst() {
        assertEquals("p=20.00, q=1.00", demo.src.main.java.com.example.Main.func2(10, 20));
    }
        @Test
    public void testFunc2Second() {
    String result = Main.func2(0.0f, 20.0f);
    assertEquals("p=0.00, q=Infinity", result);
}
}

