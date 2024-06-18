import java.util.*;
public class happynumber{
    static void r(int n){
        int s=0;
        while(n>0){
            int a=n%10;
            s=s+(a*a);
            // System.out.println(a);
            n=n/10;
            if(n==0&&(s==1||s==7)){
                System.out.print("true");
                return;
            }
            else if(n==0&&(s>=0&&s<=9)){
                System.out.print("false");
                
            }
            else if(n==0){
                // System.out.println("nnnn"+s);
                n=s;
                s=0;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        r(n);
        // System.out.print(b);
        
    }
}