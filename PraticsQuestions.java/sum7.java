package pratice;
import java.util.*;
public class sum7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="this is a test";
        String s2="is";
        String[] s3=s1.split(" ");
        for(int i=0;i<s3.length;i++){
            if(s3[i]==s2){
                System.out.println("is can be found at index "+i);
                return;
            }
        }
        System.out.print("false");
    }
}
