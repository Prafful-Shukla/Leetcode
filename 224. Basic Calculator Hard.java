class Solution {
    public int calculate(String s) {
        
        int curr = 0;//current digit being evaluated
        int res = 0;//current total
        int sign = 1;//1 for + or -1 for -
        
        Stack<Integer> stack = new Stack<>();
        //stack,to keep track of the res and sign when iterating between brackets "(" ")" and 
        //res and sign are reset for evaluating the expression inside
        
        for (int i = 0; i<s.length();i++){            
            
            if(Character.isDigit(s.charAt(i))){
                curr = curr*10 +  (s.charAt(i) - '0');//s.charAt(i) - '0'used to convert character to integer
            }
            
            else if (s.charAt(i) == '+' || s.charAt(i) == '-' ){
                res+= sign*curr;
                if(s.charAt(i) == '+') sign = 1;               
                else sign = -1;               
                curr = 0;
            }
            
            else if (s.charAt(i)=='(') {
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;                
            }
            else if (s.charAt(i)==')'){        
                res+= sign*curr;
                res *= stack.pop();
                res += stack.pop();
                curr = 0;                
            }        
        
        }
        return  res+sign*curr;
    }
}












// class Solution {
//      private int solve(String sum){  
//         return 0;
//      }
    
    
    
//     public int calculate(String s) {
        
//         StringBuilder sb=new StringBuilder();
//         StringBuilder ans=new StringBuilder();
        
//         //s=s.replaceAll("\\s+","");//regex pattern
//         // String[] s1=s.split("\\s+");
//         // for(String a:s1)
//         //System.out.println(s);
        
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='('){
//                 i++;
//             while(s.charAt(i)!=')')
//                 sb=sb.append(Character.toString(s.charAt(i++)));
//             }
            
            
//         }
        
//         System.out.println(sb.toString());
        
//         //while(s.charAt(""))
//         //1+2-(2-3-4)+ 537
//         return 0;          
//     }
// }
