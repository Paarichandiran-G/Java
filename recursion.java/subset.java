import java.util.*;
public class subset {
    static int a=0;
     static void subset(String t,String str){
        if(str.isEmpty()){
            a++;
            System.out.println(t+" "+a);
            return;
        }
        char c=str.charAt(0);
        subset(t+c,str.substring(1));
        subset(t,str.substring(1));
     }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        subset("",s);
    }
}
