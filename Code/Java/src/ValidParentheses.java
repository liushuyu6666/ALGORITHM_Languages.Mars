import java.util.*;

public class ValidParentheses {
    public boolean solution(String s){
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');
        Stack<Character> stack = new Stack<>();
        char leftBracket;
        for(int i = 0; i < s.length(); i++){
            if(brackets.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else if(brackets.containsValue(s.charAt(i))){
                if(stack.isEmpty()){
                    return false;
                }
                leftBracket = stack.pop();
                if(brackets.get(leftBracket) != s.charAt(i)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        String s = "()[{}";
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.solution(s));
    }
}
