import java.lang.reflect.Array;
import java.util.*;
public class sum14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        s1=s1.replace(",", "").replace(" ","");
        s2=s2.replace(",", "").replace(" ","");
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(c1.equals(c2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        

    }
}
