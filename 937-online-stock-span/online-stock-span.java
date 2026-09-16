class StockSpanner {
    Stack<Integer> s1;

    public StockSpanner() {
        
      s1 = new Stack<>();
    }
    
    public int next(int price) {
        int count = 1;
        for(int i = s1.size()-1;i >= 0;i--){
            if(s1.get(i) <= price){
                count++;
            }else{
                break;
            }
        }
        s1.push(price);
        return count;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */