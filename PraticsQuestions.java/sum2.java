// package pratice;
import java.util.*;
public class sum2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(s1.equals(s2)){
            System.out.println("Equal");
        }
        else if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equal if Case ignorded");
        }
        else{
            System.out.println("not equal");
        }
    }
}
