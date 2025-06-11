public class MultiplicationTable {

    public int Multiplication(int a){

        int result = 0;
        int n = 10;
        for(int i = 1; i <= n; i++  ){
            result = a*i;
            System.out.println(a + "*" +  i + " = " + result);
        }
        return result;
    }
}
