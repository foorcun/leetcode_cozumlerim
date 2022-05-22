

class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        
        int l =0 , r =0; // l-r pointers
        
        int subSum =0; // window elements sum
        int max =Integer.MIN_VALUE;
        
        while(r<nums.length){
            
            subSum = subSum + nums[r];
            
            if(subSum > max) max = subSum;
            
            if(subSum < 0){
                l = r+1; // l movement
                r=l;
                subSum = 0; // pop
            }else{
                r++;
            }
                
        }
        
        return max;
        
    }
}
