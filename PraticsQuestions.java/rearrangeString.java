import java.util.*;
public class rearrangeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next(); 
        char[] c=str.toCharArray();
        Stack<Character> st = new Stack<Character>();
        String e = "";
        for(int i=0;i<str.length();i++){
            if(c[i]==')'){
                while(st.peek()!='('){
                    e=e+st.pop();  
                }
                st.pop(); 
                for(int j=0;j<e.length();j++){
                    st.push(e.charAt(j));
                }
                e="";
            }
            else{
                 st.push(c[i]);
            }
        }
        e=st.toString().replace("[", "").replace(", ","").replace("]","");      System.out.println();
        System.out.print(e);

    }
}
