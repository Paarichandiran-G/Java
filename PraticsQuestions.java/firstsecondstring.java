import java.util.*;
public class firstsecondstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s1=sc.next();
        String s2=sc.next();
        String[] s3=str.split(" ");
        int x=0;
        int y=1;
        for(int i=2;i<s3.length;i++){
            if(s1.equals(s3[x]) && s2.equals(s3[y])){
                System.out.println(s3[i]);
            }
            x++;
            y++;
        }
    }
}
