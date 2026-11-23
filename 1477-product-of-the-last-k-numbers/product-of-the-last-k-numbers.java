class ProductOfNumbers {
    private ArrayList<Integer> nums = new ArrayList<>();
   

    public ProductOfNumbers(){
       
    
    }
    
    public void add(int num) {
        nums.add(num);
        
    }
    
    public int getProduct(int k) {
        int product = 1;
        for (int i = nums.size() - k; i < nums.size(); i++) {
            product *= nums.get(i);
        }
        return product; 
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */