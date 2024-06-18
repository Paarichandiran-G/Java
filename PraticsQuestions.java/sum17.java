import java.util.*;
public class sum17 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    int a=s1.length();
    int b=s2.length();
    if(a>b){
        System.out.println("maximum"+s1);
    }
    else if(a==b){
        s1=""+s1.charAt(0);
        s2=""+s2.charAt(0);
        a=s1.compareTo(s2);
        b=s2.compareTo(s1);
        if(a>b){
            System.out.println(s1);
        }
        else{
            System.out.println(s2);
        }
    }
    else{
            System.out.println("minimum"+s2);
        }
        
    }
 }   

