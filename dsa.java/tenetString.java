import java.util.*;
public class tenetString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] c=sc.next().toCharArray();
        char[] d=sc.next().toCharArray();
        HashMap<Character,Character> h=new HashMap<>();
        for(int i=0;i<c.length;i++) {
            if(h.containsKey(c[i])){
                if(h.get(c[i])==d[i])
                   continue;
                   else{
                    System.out.println("No");
                    return;
                   }
            }
            else{
                h.put(c[i],d[i]);
                System.out.println(h);
            }
        }
        // System.out.println("Yes");
    }
}
