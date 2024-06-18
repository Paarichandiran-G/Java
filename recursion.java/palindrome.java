import java.util.*;
public class palindrome {
    static String palin(int n){
        if(n==0){
            return "";
        }
        return n%10+""+palin(n/10);
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(palin(n));
    // int e=palin(n);
    // if(e==n){
    //     System.out.print("palin");
    // }
    // else{
    //     System.out.print("Not");
    // }
 }   
}
