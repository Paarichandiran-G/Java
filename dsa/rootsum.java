import java.util.*;
public class rootsum {
    static int root(int a){
        int sum=a;
        while(sum>=10){
            sum=root1(sum);
        }
        return sum;
    }
    static int root1(int t){
        int sum=0;
        while(t!=0){
            sum=sum+t%10;
            t=t/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=root(n);
        System.out.print(r);
    }
}
