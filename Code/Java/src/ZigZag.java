import java.util.ArrayList;
import java.util.List;

public class ZigZag {
    public int[] isZigZag(int[] numbers){
        int[] ans = new int[numbers.length - 2];
        for(int i = 0; i < numbers.length - 2; i++){
            if((numbers[i] > numbers[i+1] && numbers[i+1] < numbers[i+2]) ||
                    (numbers[i] < numbers[i+1] && numbers[i+1] > numbers[i+2])){
                ans[i] = 1;
            }
            else ans[i] = 0;
        }
        return ans;
    }
}
