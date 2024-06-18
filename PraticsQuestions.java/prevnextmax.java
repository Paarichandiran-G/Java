import java.util.*;
public class prevnextmax{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){ //[5,2,4,4,5]
            a[i]=sc.nextInt();
        }
        if(n<3){
            System.out.print("-1");
            return;
        }
             int t1=a[a.length-1]*a[1];
             int t2=a[a.length-2]*a[0];
             int sum=0;
             int k=0;
             for(int i=1;i<n-1;i++){
                sum=a[i-1]*a[i+1];
                if(t1<sum){
                    t1=sum;
                  k=i;
                }
             }
             if(t1<t2){
                 System.out.print(a[a.length-1]);
             }
             else{
                 System.out.print(a[k]);
             }
    }
}