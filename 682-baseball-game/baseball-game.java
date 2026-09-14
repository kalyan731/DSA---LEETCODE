class Solution {
    public int calPoints(String[] arr) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = arr.length;
        
        for(int i = 0; i < n;i++){
            if(arr[i].equals("C")) st.pop();
            else if(arr[i].equals("D")) st.push((st.peek())*2);
            else if(arr[i].equals("+")){
                int y = st.pop();
                int x = y + st.peek();
                st.push(y);
                st.push(x);

            }else{
                int num = Integer.parseInt(arr[i]);
                st.push(num);

            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
        
    }
}