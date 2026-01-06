import org.junit.Test;
import static org.junit.Assert.*;
public class TestFync1 {

    @Test(expected = ArithmeticException.class)
    public void testFunc1Second() {
        demo.src.main.java.com.example.Main.func1(0, 0,0);
    }
        @Test
    public void testFunc1First(){
        assertEquals(0, demo.src.main.java.com.example.Main.func1(10,5,0));
    }



}
