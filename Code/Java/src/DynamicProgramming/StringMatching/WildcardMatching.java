package DynamicProgramming.StringMatching;

public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        int row = p.length() + 1, col = s.length() + 2;
        boolean[][] match = new boolean[row][col];
        for(int j = 0; j < col; j++){
            match[0][j] = false;
        }
        match[0][1] = true;
        for(int i = 0; i < row; i++){
            match[i][0] = false;
        }
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(p.charAt(i-1) == '*'){
                    // if pattern = *, it depends on the top left, left and top
                    match[i][j] = (match[i][j-1] || match[i-1][j] || match[i-1][j-1]);
                }
                else if(p.charAt(i-1) == '?'){
                    // it depends on the top left
                    match[i][j] = match[i-1][j-1];
                }
                else{
                    // it depends top left
                    match[i][j] = match[i-1][j-1] && (p.charAt(i-1) == s.charAt(j-2));
                }
            }
        }
        return match[row-1][col-1];
    }
    public static void main(String args[]){
        String s = "acdcb";
        String p = "a*c?b";
        WildcardMatching wildcardMatching = new WildcardMatching();
        System.out.println(wildcardMatching.isMatch(s, p));
    }
}
