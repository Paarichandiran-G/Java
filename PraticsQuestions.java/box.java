import java.util.*;
public class box{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int[] arr=new int[a];
            
            for(int j=0;j<a;j++){
                arr[j]=sc.nextInt();
            }
            int sum=arr[0]+arr[1];
            int t=sum;
            for(int k=2;k<a;k++){
               sum=sum+arr[k];
               t=t+sum;
            }
            System.out.println(t);
        }
    }
}