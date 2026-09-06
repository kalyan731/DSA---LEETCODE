class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2 = nums2.length;
        int n1 = nums1.length;
        Stack<Integer> s = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i < n2;i++){
            while(!s.isEmpty() && s.peek() <= nums2[i]){
                hm.put(s.pop(),nums2[i]);
            }
            
            s.push(nums2[i]);
            
        }
        while(!s.isEmpty()){
            hm.put(s.pop(),-1);
        }
        int[] res = new int[n1];
        for(int i = 0;i < n1;i++){
            res[i] = hm.get(nums1[i]);
        }
        return res;
        
    }
}