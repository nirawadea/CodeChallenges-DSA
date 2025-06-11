import java.util.Stack;

public class StockSpan {

    public int[] calculateSpan(int[] price){
        int[] span = new int[price.length];
        span[0] = 1;
        Stack<Integer> indexStack = new Stack<>();
        indexStack.push(0);

        for (int i =1; i<price.length; i++){
            if (!indexStack.isEmpty()){
                while (!indexStack.isEmpty() && price[indexStack.peek()] <= price[i]){
                    indexStack.pop();
                }
                if(indexStack.isEmpty())
                    span[i] = i+1;
                else
                    span[i] =  i - indexStack.peek();
                indexStack.push(i);
            }
        }
        return span;
    }
}
