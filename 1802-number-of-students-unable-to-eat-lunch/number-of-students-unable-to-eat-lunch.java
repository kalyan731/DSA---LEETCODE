class Solution {
    public int countStudents(int[] n1, int[] n2) {
        Queue<Integer> s = new LinkedList<>();
        Stack<Integer> sa = new Stack<>();
        int n = n2.length;

        for(int i = 0;i < n;i++){
            sa.push(n2[n - i -1]);
            s.offer(n1[i]);
            
        }
        int ls = 0;


        while(s.size() > 0 && ls < s.size() ){
            if(s.peek() == sa.peek()){
                sa.pop();
                s.poll();
                ls = 0;

            }else{
                s.offer(s.poll());
                ls++;
            }
        }
        return s.size();

        
    }
}