class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int t = 0;
        int lt = 0;
        for(int i = 0;i < n;i++){
            if(nums[i] == target){
                t++;
            }
            if(nums[i] < target){
                lt++;
            }
        }
        for(int i = 0;i < t;i++){
            arr.add(lt+i);
        }
       return arr; 
    }
}