package DynamicProgramming.StringMatching;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        int row = p.length() + 1, col = s.length() + 1;
        boolean[][] board = new boolean[row][col];
        // init
        board[0][0] = true;
        for(int j = 1; j < col; j++){
            board[0][j] = false;
        }
        for(int i = 1; i < row; i++){
            if(p.charAt(i-1) == '*'){
                board[i][0] = board[i-2][0];
            }
            else{
                board[i][0] = false;
            }
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                // 1, board[i-2][j] if true, return true
                // 2, left grid is true and two characters match
                // 3, left grid is true and there is a dot in the pattern
                if(p.charAt(i-1) == '*'){
                    board[i][j] = (board[i-2][j]) || (board[i][j-1] && p.charAt(i-2) == s.charAt(j-1)) || (board[i][j-1] && p.charAt(i-2) == '.');
                }
                // same as the left top
                else if(p.charAt(i-1) == '.'){
                    board[i][j] = board[i-1][j-1];
                }
                else{
                    board[i][j] = board[i-1][j-1] && (p.charAt(i-1) == s.charAt(j-1));
                }
            }
        }
        return board[row-1][col-1];
    }
    public static void main(String args[]){
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        System.out.println(regularExpressionMatching.isMatch("aab", "c*a*b"));
    }
}
