class Solution {
    public boolean checkIfPangram(String sentence) {
        
        if(sentence.length()<26)return false;
        byte check[]=new byte[26];
        
        for(short i=0;i<sentence.length();i++){
            check[sentence.charAt(i)-97]++;
        }
        for(byte i:check){
            if(i<1)return false;
        }
        return true;
    }
}
