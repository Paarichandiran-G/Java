
import java.util.*;
public class sum9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int a=sc.nextInt();
        for(int i=0;i<n.length();i++){
            if(i==7){
                System.out.print("-");
            }
            System.out.print(n.charAt(i));
        }
    }
}
