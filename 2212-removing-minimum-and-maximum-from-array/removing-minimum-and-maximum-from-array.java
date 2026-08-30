class Solution {
    public int minimumDeletions(int[] arr) {
        int n = arr.length;
        if(n <= 2){
            return n;
        }
        int mini =0;
        int maxi = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[maxi] < arr[i] ){
                maxi = i;
            
            }
            if(arr[mini] > arr[i] ){
                mini = i;
            }
        }
        int l = Math.min(mini,maxi);
        int r = Math.max(mini,maxi) ;
        int f = r+1;
        int b = n-l;
        return Math.min(Math.min(r+1,n-l),l+1+n-r);

        
    }
}