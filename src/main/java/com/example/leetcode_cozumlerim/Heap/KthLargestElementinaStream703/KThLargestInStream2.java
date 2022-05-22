class KThLargestInStream2 {
    
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> a-b);
    int k ;
 
    public KthLargest(int k, int[] nums) {
        
        this.k=k;
        
        for(int i =0 ;i<nums.length;i++ ){
            
            add(nums[i]);
            
            
        }
        
        
    }
    
    public int add(int val) {
        
        minHeap.add(val);
        
        if(minHeap.size()>k){
            minHeap.poll();
        }
        
        return minHeap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
