class Solution {
    public int missingMultiple(int[] nums, int k) {
        
      for(int m = k;;m += k){
        boolean b = false;
        for(int j = 0; j < nums.length;j++){
            if(nums[j] == m){
                b = true;
                break;
            }

        }
        if(!b){
            return m;
        }
      }
     
       

       
    }
}