import java.util.Stack;

//This problem finds NSL and NGR
//Then width is calculated in using width = (right-left-1)
//Then Area is calculated Area = arr[i] * width[i]
//After Area found then we find Max value in the given list
public class MaxAreaHistogram {

    public static int LargestRectangle(int[] h){
        Stack<Integer> stk = new Stack<>();
        int maxArea = 0;
        int n = h.length;

        for(int i =0; i<=n; i++){
            // if we reach end use h height 0 as stopping condition
            int currentHeight = i == n ? 0 : h[i];
            while (!stk.isEmpty() && h[stk.peek()]>currentHeight){
                int top = stk.pop();
                int width = stk.isEmpty() ? i : i-stk.peek()-1;
                int area = h[top]*width;
                maxArea = Math.max(area, maxArea);
            }
            stk.push(i);

        }
        return maxArea;
    }
}
