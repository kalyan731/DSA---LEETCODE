class Solution {
    public int missingMultiple(int[] nums, int k) {
        
       HashSet<Integer> s = new HashSet<>();
       for(int n : nums){
        s.add(n);

       }
       int num = k;
       while(s.contains(num)){
        num += k;
       }
       return num;
       

       
    }
}