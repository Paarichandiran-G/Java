import java.util.*;
public class string {
    public static String solve(String s1,String s,char c,int a,int l){
        if(a==l){
         return "";
        }
       if(s.charAt(a)==c){
        return solve(s1,s,c,a+1,l);
       }
       
       return s.charAt(a)+""+solve(s1,s,c,a+1,l);
       
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1="";
        char c='a';
        int a=0;
        int l=s.length();
        String b=solve(s1,s,c,a,l);
        System.out.print(b);
    }
}


//9342157569--balaji
//9629148949--suthesh

//9080326477