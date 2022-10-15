import java.util.Stack;;
public class ParanthesisMatching {
    public static void main(String[] args) {
        String exp = "";
        System.out.println(isValid(exp));
    }
    static boolean isValid(String s){
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(isOpening(ch)){
               stack.push(ch);
            }
            else{
                if(!isMatch(ch, stack)){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    static boolean isMatch(char ch ,Stack<Character>stack)
    {
        return (ch==')' && stack.peek()=='(') || (ch==']' && stack.peek()=='[') || (ch=='}' && stack.peek()=='{');
    }
    static boolean isOpening(char ch)
    {
        return ch=='(' || ch=='[' || ch=='{';
    }
}
