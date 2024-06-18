import java.util.*;
public class selectionsort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int min=i;
            int t=0;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=i){
                t=a[i];
                a[i]=a[min];
                a[min]=t;
            }
            for(int x=0;x<n;x++){
                System.out.print(a[x]+" ");
            }
            System.out.println();
        }
    }
}