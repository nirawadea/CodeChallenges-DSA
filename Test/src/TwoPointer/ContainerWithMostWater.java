package TwoPointer;

public class ContainerWithMostWater {
    // h = {1,8,6,2,5,4,8,3,7}
    //Goal: Find two lines that, along with the x-axis, hold the most water.  “Start wide and go tall.”
    //area = min(height[i], height[j]) * (j - i)

    public int maxArea(int[] height){

        int left=0;
        int right = height.length-1;
        int maxArea = -1;

        while(left<right){
            int area = Math.min(height[left], height[right]) * (right-left);
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}
