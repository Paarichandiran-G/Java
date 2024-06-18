import java.util.*;
public class sum11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ss=sc.next();
        int a=s.compareTo(ss);
        int b=ss.compareTo(s);
        // System.out.print(s.compareTo(ss));
        // if(a>b){
        //     System.out.print(ss+","+s);
        // }
        // else{
        //     System.out.print(s+","+ss);
        // }
        System.out.print(a+" "+b);
    }
}
