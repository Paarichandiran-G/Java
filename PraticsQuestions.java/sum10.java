import java.util.*;
public class sum10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
            //String s="lala";
            // if(s.contains(str)){
            //         System.out.print("i");
            //      }
        str=str.replace("lala","i");

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='w'){
                System.out.print("o");
            }
            else if(c=='#'){
                 System.out.print("' '");
            }
            else if(c=='2'){
                System.out.print("m");
            }
            else if(c=='-'){
                  System.out.print("p");
             }
             else{
                System.out.print(c);
             }
        }
    }
}
