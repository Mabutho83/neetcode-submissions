class Solution {
    //using strings in this case is so clever dude, I would've never come up
    //with something like this honestly. New tool added I guess
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>(); 
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                char current_val = board[row][col]; 
                if(current_val != '.'){
                    if(!seen.add(current_val + "found in row " + row) || 
                    !seen.add(current_val + "found in col " + col) ||
                     !seen.add(current_val + "found in sub-box " + row/3 + "," + col/3))
                    return false;
                }
            }

        }
        return true; 

    }

}
