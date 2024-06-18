import java.util.*;
public class emmajump{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n-2;i++){
            if(a[i+2]==0){
                c++;
                i=i+1;
            }
            else if(a[i+1]==0){
                c++;
            }
        }
        System.out.print(c);
    }
}