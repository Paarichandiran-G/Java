import java.util.*;
public class sum26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Arrays sorting");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
                
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
