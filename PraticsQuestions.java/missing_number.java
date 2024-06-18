import java.util.*;
public class missing_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
            if(a[i]+1==a[i+1] || a[i+1]==a[i]){
              continue;
            }
            else{
                if(a[i]+1>=0){
                System.out.print(a[i]+1);
                return;
                }
            }
        }
        System.out.print(a[a.length-1]+1);
    }
}
