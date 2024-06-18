import java.util.*;
public class nimgame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean f=true;
        int t=n;
        int k=0;
        int val=1;
        // if(n<=3){
        //     System.out.print(true);
        //     return;
        // }
        // t=t-3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=3;j++){
                if(t-j==k&&val%2!=0){
                    System.out.print(true);
                   // return;
                }
                if(t-j==k&&val%2==0){
                    System.out.print(false);
                   // return;
                }
            }
            val++;
            t=t-3;
            i=i+2;
        }
        
    }
}