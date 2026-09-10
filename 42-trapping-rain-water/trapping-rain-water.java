class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxl = 0;
        int maxr = 0;
        int totalw = 0;

        while(left <= right){
        if (height[left] <= height[right]) {
            if(height[left] > maxl){
                maxl = height[left];
            }else{
                totalw += maxl - height[left];
            }
            left++;

        }else{
            if(height[right] >= maxr){
                maxr = height[right];
            }else{
                totalw += maxr - height[right];
            }
            right--;
            
          }

        }
            
        return totalw;
        
    }
}