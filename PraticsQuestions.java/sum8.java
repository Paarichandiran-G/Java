import java.util.*;
public class sum8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int a=s1.indexOf(s2);
        System.out.print(s1.contains(s2)+" "+a);
    }
}
