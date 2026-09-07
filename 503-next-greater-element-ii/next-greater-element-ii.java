class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s= new Stack<>();
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 2*n - 1;i >= 0;i--){
            int in = i%n;
            int cur = nums[in];
            while(!s.isEmpty()&& s.peek()<= cur){
                s.pop();
            }
            if(i < n){
                if(s.isEmpty()){
                    res[i] = -1;

                }else{
                    res[i] = s.peek();
                }
            }
            s.push(cur);
        }
        return res;
        
    }
}