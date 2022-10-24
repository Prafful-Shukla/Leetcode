class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        
        Arrays.sort(nums);
        if(nums[nums.length-1]!=nums.length)//for checking case2
            ans[1]=nums.length;
        if(nums[0]!=1) //for checking case3
            ans[1]=1;
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) 
                ans[0]=nums[i];
            //1 2 3 5 5 6 7 (4 missing)//case1 
            //1 2 3 3 4 5 6 (7 missing)//case2
            //2 3 4 5 5 6 7 (1 missing)//case3
            else if(nums[i]!=nums[i+1]-1){
                ans[1]=nums[i]+1;
            }
        }
        return ans;               //time O(nlogn)
    }                             //space constant                      
}
