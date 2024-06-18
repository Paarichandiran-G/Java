import java.util.*;
public class sum18 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    // for(int i=0;i<str.length();i++) {
    //     char c=str.charAt(i);
    //     if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
    //         System.out.print(c);
    //     }
    // }
    str=str.replaceAll("[^aeiouAEIOU]","");
    System.out.println(str);
   }    
}
