class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n/2;
        long a=0;
        long b=0;
        for(int x=0;x<n/2;x++){
            a+=nums[x];
            b+=nums[x+n/2];
        }
        int cnt=0;
        if(a>b){
            cnt=1;
        }
        
        int k=1;
        while(k<n){
            a-=nums[i];
            a+=nums[j];
            b-=nums[j];
            b+=nums[i];
            if(a>b){
                cnt++;
            }
            i=(i+1)%n;
            j=(j+1)%n;
            k++;
        }
        return cnt;

    }
}