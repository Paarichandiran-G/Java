import java.util.*;
public class trailingzeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] dp=new int[100001];
        int k=1;
        for(int i=5;k<=100000;i+=5){
            int num=i;
            int pow=5;
            int zero=0;
            while(num>=pow){
                zero+=num/pow;
                pow*=pow;
            }
            if(zero>100000){
                break;
            }
            dp[k]=zero;
            k=zero;
        }
        while(t-->0){
            int n=sc.nextInt();
            if(dp[n]==0){
                System.out.println(0);
            }
            else{
                System.out.println(5);
                for(int i=0;i<5;i++){
                    System.out.println((dp[n]+i)+" ");
                }
            }
        }
    }
}
