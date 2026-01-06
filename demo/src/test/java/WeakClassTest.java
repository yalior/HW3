import org.junit.Test;

import demo.src.main.java.com.example.WeakClass;

import static org.junit.Assert.*;
public class WeakClassTest {
    @Test
    public void testSatmentCOverage(){
        WeakClass wc= new WeakClass();
        int result= wc.weakMethod(5);
        assertEquals(20,result);
    }
    @Test(expected = ArithmeticException.class)
    public void testBranchCoverage(){
        WeakClass wc= new WeakClass();
        wc.weakMethod(-1);
    }
}
