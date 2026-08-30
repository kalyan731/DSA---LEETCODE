class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i =0;i < nums.length ;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        int spl = 0;
        for(int i = 0;i < nums.length;){
            int freq = map.get(nums[i]);

            int j = i;
            while(j < nums.length && nums[i] == nums[j]){
                j++;
            }
            int block = j - i;
            if(block == freq) spl++;
            i = j;
        }
        return spl;
        
    }
}