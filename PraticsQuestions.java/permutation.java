import java.util.*;
public class permutation {
    public static void peram(String p, String up){
       if(up.isEmpty()){
        System.out.println(p);
        return;
       }
        //   char c=up.charAt(0);
       for(int i=0;i<up.length();i++){
           String f=up.substring(0, i);
           String s=up.substring(i+1);
           peram(p+up.charAt(i),f+s);
       }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //char[] c=s.toCharArray();
        peram("",s);
    }
}
