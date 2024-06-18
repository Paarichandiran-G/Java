import java.util.*;
public class sum16 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int sum=0;
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(c>='0' && c<='9'){
           sum=sum+c-'0';
        }
    }
    System.out.println(sum);
   }    
}
