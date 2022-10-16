class Solution {
    public int compress(char[] chars) {
        //if length 2  A2 is possible
        //base case if length is 1(there will be 1 group and same string)
        if(chars.length==1) return 1;
        
        
        int fast=0;// will check if previous character is notsame  
        int finalArr=0;// it will change value depending on fast
        
        int count;//to count repetition
        
        while(fast<chars.length){// will take fast to n 
            count=1;//this loop will check for new character every single time so                        //update count to 1;
            
            while(fast<chars.length-1 && chars[fast]==chars[fast+1]){//will count for repetion 
                count++;//counting repetiton 
                fast++;//ignoring repetition position just checking final position
                //and then storing in finalArr pos
            }
            
            chars[finalArr++]=chars[fast++];//changing same array with like values
            //finalArr++;
            //fast++;
            
            if(count>1){//bcoz if count is 1 u dont need to store
                        //digit(count) on next index
                
                //now changing count to string and adding each character to 
                //a new character array ,chars array one by one
                for(char c : String.valueOf(count).toCharArray()){
                    // for each loop need array and string.toCharArray changes 
                    //string to charArray 
                    chars[finalArr]=c;
                    finalArr++;
                }               
            }                    
        }
        return finalArr;
    }
}
        
        
        
        
        
    
