class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         HashMap<Integer,Integer>map=new HashMap<>();//store nums[i] & index
        
        for(int i=0 ;i<nums.length;i++){
            if(map.containsKey(nums[i]) && Math.abs(i-map.get(nums[i]))<=k)
                return true;
            map.put(nums[i],i);
        }
        return false;
        
    }
}

//1 2 3 1 2 3 nums
//0 1 2 3 4 5 index
//k=2
// [1,0][2,1][3,2]
//i=3 abs[3-map.get(1)]//1 value is with 0 index 
//abs[3-0] which is greater than 2
//[1,3]
// i=4  abs[4-get[2]] 4-1=3
//[2,4]
//i=5  abs[5-get[3]]  5-2=3
// i=6 for loop ends
//false
