class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       
        Map<Integer,Integer> map=new HashMap<>();
        int prefixsum=nums[0];
        int rem;
        
        map.put(prefixsum%k,0);//map[23,0]
        // 5
        for(int i=1;i<nums.length;i++){
            
            prefixsum=prefixsum+nums[i];//25 
            rem=prefixsum%k;//1 
            
            if(rem==0)return true;
            
            if(map.containsKey(rem)){ 
                if(map.get(rem)<=i-2)
                return true;
            }
            else
                map.put(rem,i);//map[1,1]     
        }
        return false;
    }
}
