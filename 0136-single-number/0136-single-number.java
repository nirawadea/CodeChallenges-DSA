class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length-1;
  
        for(int i=0; i<=n; i++){
            if(map.containsKey(nums[i])){
               map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }   

        }
        System.out.println(map);

            for(Map.Entry<Integer, Integer> m : map.entrySet()){
            //map.put(m.getValue()-1);
            if(m.getValue() == 1){
            return m.getKey();
            }
        
        }
        return -1;
}
}