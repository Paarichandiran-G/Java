import java.util.*;
public class sum19 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String[] s=str.split(" ");
    for(int i=0; i<s.length; i++) {
       String temp=s[i];
       StringBuffer sb=new StringBuffer(s[i]);
        sb.reverse();
        String m=sb.toString();
        if(temp.equals(m)&&temp.length()!=1){
            for(int j=0; j<m.length(); j++){
                System.out.print("*");
            }
        }
        else{
            System.out.print(temp);
        }
        System.out.print(" ");
   } 
}   
}
