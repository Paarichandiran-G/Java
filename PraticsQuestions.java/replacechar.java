import java.util.*;
public class replacechar {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    //String s=sc.next().substring(1).replaceAll("(\\p{L})\\1+", "$1");
    char[] str=sc.next().substring(1).toCharArray();
    Set set=new HashSet();
    for(int i=1;i<str.length;i++){
        set.add(str[i]);
    }
    System.out.println(set.toString());
    System.out.print(set.size());
}
}
