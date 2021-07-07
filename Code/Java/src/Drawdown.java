import java.util.ArrayList;
import java.util.List;

public class Drawdown {
    public List<Float> solution(int[] arr){
        List<Float> ans = new ArrayList<>();
        if(arr.length < 2) return ans;
        int peak = Integer.MIN_VALUE, trough = Integer.MAX_VALUE;
        for(int i : arr){
            if(i > peak){ // you didn't find the real peak
                // calculate the previous drawdown
                if(peak > trough){
                    ans.add(helper(peak, trough));
                }
                peak = i;
                trough = Integer.MAX_VALUE;
            }
            else{ // already find the real peak, need to find the real trough
                trough = Math.min(trough, i);
            }
        }
        if(peak > trough){
            ans.add(helper(peak, trough));
        }
        return ans;
    }
    public float helper(int peak, int trough){
        if(peak > trough){
            return (float)Math.floor(((float)(peak - trough) / peak) * 100) / 100;
        }
        else return 0;
    }
    public static void main(String args[]){
        int[] stock = new int[]{3, 2, 4, 5, 3, 2, 4, 6, 3, 4, 2, 5};
        Drawdown question1 = new Drawdown();
        List<Float> ans = question1.solution(stock);
        System.out.println(ans);
    }
}