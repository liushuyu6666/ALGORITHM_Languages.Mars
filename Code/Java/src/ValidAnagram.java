import java.util.Arrays;

public class ValidAnagram {
    public boolean solution(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] letter = new int[26];
        Arrays.fill(letter, 0);
        for(int i = 0; i< s.length(); i++){
            letter[s.charAt(i) - 'a']++;
            letter[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(letter[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String t = "catessr";
        String s = "actress";
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.solution(t, s));
    }
}
