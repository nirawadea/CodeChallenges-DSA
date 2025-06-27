package TwoPointer;

// 420325
public class TrappingRainWater {
    public int trap(int[] height) {

        int n = height.length;
        int left = 0;
        int right = n-1;
        int totalWater = 0;
        int maxLeft = 0;
        int maxRight = 0;

        if(height == null || height.length == 0){
            return 0;
        }

        while(left <= right){
            if(height[left] <= height[right]){
                maxLeft = Math.max(maxLeft, height[left]);
                totalWater += maxLeft -height[left];
                left++;
            }else{
                maxRight = Math.max(maxRight, height[right]);
                totalWater += maxRight - height[right];
                right--;
            }
        }
        return totalWater;

    }

}
