package SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//use queue to track the negative no's
//only store values inside the current window
//always check if arr[i] is negative & in queue then remove it

public class FirstNegativeNumWindow {

    public static List<Integer> firstNegativeWindow(int[] arr, int k){

        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        while(j<arr.length){
            if(arr[j] < 0){
                q.add(arr[j]);
            }

            if(j-i+1 == k){
                if(!q.isEmpty()){
                    list.add(q.peek());
                }else{
                    list.add(0);
                }

                if(arr[i] < 0){
                    q.remove();
                }
                i++;
            }
            j++;
        }
        return list;
    }
}

//TC- O(n)
//SC- O(k)
