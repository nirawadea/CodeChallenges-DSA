package PriorityQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreq {

    public int[] topKFrequent(int[] nums, int k){

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<=nums.length-1; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1 );
        }
        System.out.println("MAP" + map);

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b)->a.getValue()-b.getValue());
        pq .addAll(map.entrySet());

        System.out.println("PQ" + pq);

        int[] arr = new int[k];

        for(int i=0; i<k; i++){
            Map.Entry<Integer,Integer> newEntry = pq.poll();
            arr[i] = newEntry.getKey();
        }
        return arr;
    }
}
