class Solution {
    public boolean exist(char[][] board, String word) {
     
        //searching for starting point
        //
        
        for(int i=0;i<board.length;i++){ 
            for(int j=0;j<board[0].length;j++){
             if(find(i,j,word,board,0))
                 //func that will look top ,bottom ,right ,left for each character of word
                 //index 0 in the starting
                 //i.e 1st character of word
                 return true;  
            }
       
        }
        return false;
    }
    private boolean find(int i,int j,String word,char[][] board, int l){
        
        //BASE CASE
        
        if(l==word.length())return true;
        //when we have traversed all chars of word.
            
        if(i<0 ||j<0 ||i>=board.length||j>=board[0].length||board[i][j]!=word.charAt(l)) return false;
        //if we come out of board while moving left ,right ,top or bottom.
        
        char temp=board[i][j];
        board[i][j]='*';//marking visted char in board
  
        //if we have found same char at any location we return true.       
          if( find(i-1,j,word,board,l+1)||find(i+1,j,word,board,l+1)
            ||find(i,j+1,word,board,l+1)|find(i,j-1,word,board,l+1)) 
            return true;
        
            
            
         board[i][j]=temp;
        //backtracking step undo the changes done before the recursive calls if we have not found any ans so    far for that row.     
            return false;

        
    } 
}
