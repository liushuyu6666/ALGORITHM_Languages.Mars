
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * FormingAMagicSquare
 */
public class FormingAMagicSquare {

    public static int formingMagicSquare(List<List<Integer>> s) {
        int[][] g1 = new int[][]{{8, 3, 4}, 
                                {1, 5, 9},
                                {6, 7, 2}};
        int[][] g2 = new int[][]{{4, 3, 8},
                                 {9, 5, 1},
                                 {2, 7, 6}};
        int ans = 100;
        for(int i = 0; i < 4; i++){
            // System.out.println(minForming(s, g1));
            // System.out.println(minForming(s, g1));
            ans = Math.min(ans, minForming(s, g1));
            ans = Math.min(ans, minForming(s, g2));
            rotate(g1);
            rotate(g2);
        }
        return ans;
    }

    public static void rotate(int[][] s){
        int temp;
        for(int i = 0; i < 2; i++){
            for(int j = 0;j < 1; j++){
                temp = s[i][j];
                s[i][j] = s[j][2-i];
                s[j][2-i] = s[2-i][2-j];
                s[2-i][2-j] = s[2-j][i];
                s[2-j][i] = temp;
            }
        }
    }

    public static int minForming(List<List<Integer>> s, int[][] t1){
        int cnt = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                cnt += Math.abs(s.get(i).get(j) - t1[i][j]); 
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        FormingAMagicSquare formingAMagicSquare = new FormingAMagicSquare();
        
        List<List<Integer>> s = new ArrayList<>();
        Integer[] t1 = new Integer[]{4, 9, 2};
        Integer[] t2 = new Integer[]{3, 5, 7};
        Integer[] t3 = new Integer[]{8, 1, 5};
        List<Integer> s1 = Arrays.asList(t1);
        List<Integer> s2 = Arrays.asList(t2);
        List<Integer> s3 = Arrays.asList(t3);
        s.add(s1);
        s.add(s2);
        s.add(s3);
        System.out.println(formingMagicSquare(s));
    }
}