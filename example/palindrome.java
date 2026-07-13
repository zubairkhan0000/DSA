import java.util.Stack;

public class palindrome {
    public static void main(String[] args) {
        String s="{{(())}}";
        System.out.println(ans(s));
    }
    static boolean ans(String s){
        int n=s.length();
        
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)=='}' || s.charAt(i)==')'){
                if(stack.isEmpty()){
                    return false;
                }
                if(s.charAt(i)=='}'&& stack.peek()=='{'||s.charAt(i)==')'&& stack.peek()=='('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            
        }
        
        return stack.isEmpty();
    }
}
