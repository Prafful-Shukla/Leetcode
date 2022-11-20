class Solution {
    public boolean isUgly(int n) {
            int run;
        while(true){
            run=n;
            if(n%2==0)  n=n/2;
            if(n%3==0)  n=n/3;
            if(n%5==0)  n=n/5;
            if(run==n)  break;
        }

        return n==1;
    }
}




















//       if(n==0)return false;
        
//         int a=2;
//         do{
//             if(n%2==0)n=n/2;
//             else a=3;
//             if(n%3==0)n=n/3;
        
//                 if(a==3)a=5;
            
//             if(n%5==0)n=n/5;   
//         }while(n%a==0);
            
        //     n=n/2;
        // while(n%3==0)
        //     n=n/3;
        // while(n%5==0)
        //     n=n/5;
        // System.out.println(n);
        // return n==1;
            
