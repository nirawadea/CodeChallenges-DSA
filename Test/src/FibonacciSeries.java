public class FibonacciSeries {

    public int x = 0;
    public int y = 1;
    public int total = 0;
    public int n;


    public int fibonacci(int n){
        while (total <= n){
            x = y;
            y = total;
            total = x+y;
        }
        return y;
    }
}
