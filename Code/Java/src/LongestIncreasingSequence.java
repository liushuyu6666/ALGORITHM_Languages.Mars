import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LongestIncreasingSequence {
    public int solution(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int value : arr){
            listSort(list, value);
        }
        return list.size();
    }

    public static void listSort(List<Integer> list, int target){
        if(!list.isEmpty()){
            for(int i = 0; i < list.size(); i++){
                if(list.get(i) >= target){
                    list.set(i, target);
                    return;
                }
            }
        }
        list.add(target);
    }

    public static void main (String[] args) {
        // keep this function call here
        int arr[] = {4, 3, 5, 1, 6};
        LongestIncreasingSequence lis = new LongestIncreasingSequence();
        int ans = lis.solution(arr);
        System.out.println(ans);
    }
}
