package Math;

public class MissingNumberInArithmeticProgression {
    public int missingNumber(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (arr[0] + arr[arr.length - 1]) * (arr.length + 1) / 2 - sum;
    }
    public static void main(String args[]){
        MissingNumberInArithmeticProgression missingNumberInArithmeticProgression = new MissingNumberInArithmeticProgression();
        System.out.println(missingNumberInArithmeticProgression.missingNumber(new int[] {5, 7, 11,13}));
    }
}
