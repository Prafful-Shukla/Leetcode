class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rowLen=board.length;
        int colLen=board[0].length;
        
        //checking for ROW is valid or not
        //row must not have repeating element
        for(int i=0;i<rowLen;i++){
            if(!RowIsValid(board[i]))
                return false;
        }
        
        //checking for COLOUMN is valid or not 
        for (int i=0;i<colLen;i++){
            if(!ColIsValid(board,i))
                return false;
        }
        //check for GRID
        //grid ki starting agr (0,0 - 2,2) (0,3 - 2,5) (0,6 - 2,8) //last row.length-1
        //                     (3,0 - 5,2) (3,3 - 5,5) (3,6 - 3,8) 
        // me grid ki starting send krunga baki func krega
        for (int i=0;i<rowLen;i+=3){
            for(int j=0;j<colLen;j+=3)
            if(!gridIsValid(board,i,j))
                return false;
        }
        return true;
    }
        private boolean RowIsValid(char[] row){
            HashSet<Character>set=new HashSet<>();
            //value of ith character can be 1-9 or "."i.e no element
            for(int i=0;i<row.length;i++){
                char current=row[i];
                if(current!='.')
                    if(!set.add(current))return false;//if u cannot add element means unvalid
            }
            return true;      
        }
        
        private boolean ColIsValid(char[][] board,int col){
            HashSet<Character>set=new HashSet<>();
            //column upr se aa rhi bas row me focus krna apan ko
            for(int i=0;i<board[0].length;i++){
                char current=board[i][col];
                if(current!='.')
                    if(!set.add(current))return false;
            }
            return true;
        }
        private boolean gridIsValid(char[][] board, int row, int col ){
            HashSet<Character> set = new HashSet<>();
            for (int i = row; i < row + 3; i++){
                for (int j = col; j < col + 3; j++){
                    char current = board[i][j];
                    if (current != '.')
                        if(!set.add(current))
                        return false;
                }
            }
            return true;
        }
}
