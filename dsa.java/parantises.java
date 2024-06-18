import java.util.*;
public class parantises{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        String s=sc.next();
        Stack<Character> st=new Stack<>();
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            if(c=='{'||c=='['||c=='('){
                st.push(c);
                // System.out.println(st.peek());
            }
            else if(!st.empty()&&(
                (c=='}' && st.peek()=='{')||(c==']' && st.peek()=='[')||(c==')' && st.peek()=='('))){
                    // System.out.println(st.peek());
                    st.pop();
                }
                else{
                    st.push(c);
                    // System.out.println(st.peek());
            }
        }
        if(st.empty()){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
           
           }
    }
}