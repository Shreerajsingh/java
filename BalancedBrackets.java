import java.util.Scanner;
import java.util.Stack;
public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        String s=scn.nextLine();
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch==st.peek()) {
                if(st.peek()=='(' ) {

                }

            }
        }
    }
}
