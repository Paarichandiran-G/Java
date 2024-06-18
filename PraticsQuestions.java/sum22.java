import java.util.*;
public class sum22 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("reverse a number");
      String s=sc.next();
      StringBuffer sb=new StringBuffer(s);
      sb.reverse();
      System.out.print(sb.toString());
   } 
}
