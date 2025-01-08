import java.util.*;
public class sortint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] a=new int[s.length()];
        for(int i=0;i<s.length();i++){
            String t=""+s.charAt(i);
            a[i]=Integer.parseInt(t);
        }
        Arrays.sort(a);
        String p="";
        for(int i=0;i<a.length;i++){
            p=p+a[i];
        }
        System.out.print(Integer.parseInt(p));
    }
}
