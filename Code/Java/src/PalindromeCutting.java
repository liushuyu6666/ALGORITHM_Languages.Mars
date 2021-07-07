import java.sql.SQLOutput;

public class PalindromeCutting {
    public String solution(String s){
        int start = 0, end = s.length() - 1, newStart = prefixPalindrome(s, start, end);
        while(start != newStart){
            if(newStart + 1 < s.length()){
                start = newStart + 1;
                newStart = prefixPalindrome(s, newStart+1, end);
            }
            else{
                return "";
            }
        }
        return s.substring(newStart, end + 1);

    }
    public int prefixPalindrome(String s, int start, int end){
        while(start <= end && !isPalindrome(s, start, end)){
            end--;
        }
        return end;
    }
    public boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[]){
        PalindromeCutting palindromeCutting = new PalindromeCutting();
        System.out.println(palindromeCutting.solution("aabcaacbaacbaa"));
    }
}
