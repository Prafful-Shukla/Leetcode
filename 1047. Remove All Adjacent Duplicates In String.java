class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        while(i<sb.length()-1){
            if(sb.charAt(i)==sb.charAt(i+1)){
                 sb.deleteCharAt(i);
               sb.deleteCharAt(i);   
                i=Math.max(0,i-1);
            }
            else
                i++;       
        }
        return sb.toString();
    }
}
//Stack
// class Solution {
//     public String removeDuplicates(String s) {     
//         Stack<Character> ansStack=new Stack<>();
//         StringBuilder sb=new StringBuilder();
//         int i=0;
//         while(i<s.length()){
//             //take out element from string
//             //if already present pop 
//             //otherwwise push.
            
//             if( !ansStack.isEmpty() && s.charAt(i)==ansStack.peek()){
//                 ansStack.pop();
//             }
//             else
//             ansStack.push(s.charAt(i)); 
//             i++;                        
//         }
        
//         while(!ansStack.isEmpty()){
//             sb.insert(0,ansStack.pop());
//         }
//         return sb.toString();
//     }
// }
