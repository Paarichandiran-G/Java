import java.util.*;
public class sum24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("missing number");
    
        for(int i=0;i<n-1;i++){
            if(a[i]+1==a[i+1]){
                continue;
            }
            else{
                System.out.print("missing number is : "+(a[i]+1));
                return;
            }
        }
        System.out.print("No missing number in array");
    }
}
