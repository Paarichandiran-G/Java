import java.util.*;
public class sum21 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("sum of digits");
    int n=sc.nextInt();
    int[] a1=new int[n];
    int[] a2=new int[n];
    for(int i=0; i<n; i++){
        a1[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        if(a1[i]<10){
            a2[i]=a1[i];
        }
        else{
            int k=a1[i];
            int sum=0;
            while(k!=0){
                int a=k%10;
                sum+=a;
                k/=10;
            }
            a2[i]=sum;
        }
    }
    System.out.print(Arrays.toString(a2));
   } 
}
