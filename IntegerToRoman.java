class Solution {
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        
        int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String symbol[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        for(int i=0;i<=arr.length-1&&num>0;i++){
            while(num>=arr[i]){
                num=num-arr[i];
                res.append(symbol[i]);
            }
        }
        return res.toString();
    }
}
