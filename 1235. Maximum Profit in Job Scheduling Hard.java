class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=endTime.length;
        int[][] job=new int[n][3];
        for(int i=0;i<n;i++){
            job[i]=new int[]{startTime[i],endTime[i],profit[i]};
        }
        //to have all these 3 data in 1 space to compute
    
        Arrays.sort(job,(a,b)->a[1]-b[1]);
        
        
        //custom comparator,sorting based on end time 
        
    
        TreeMap<Integer,Integer> dp=new TreeMap<>();
        //store-if selected what will be the max profit if not then what will be the max profi
        //has all keys in sorted order - log(n)time to search as it uses binary search
        
        dp.put(0,0);
        //at the endTime 0 the max profit we can get is zero
        for(int[] jb:job){
            int val=jb[2]+dp.floorEntry(jb[0]).getValue();
            if(val>dp.lastEntry().getValue()){
                dp.put(jb[1],val);
            }
        }
        return dp.lastEntry().getValue();
        
        
        
    }
}

