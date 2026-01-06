package demo.src.main.java.com.example;
public class WeakClass {
    public int weakMethod(int x) {
        int divisor = 0;
        if(x>0){
            divisor=5;
        }
        return 100 / divisor;
    }
}