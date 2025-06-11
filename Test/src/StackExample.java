import java.util.ArrayList;
import java.util.Stack;

public class StackExample {
//This is Stock Span Problem that finds NGL
    static ArrayList<Integer> calculateSpan(int[] arry){
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> stack =  new Stack<>();
        int n = arry.length;

        for(int i =0; i<n; i++){
            while (!stack.isEmpty() && arry[stack.peek()] <= arry[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                span.add(i+1);
            }else{
                span.add(i-stack.peek());
            }
            stack.push(i);
        }
        return span;
    }
}
