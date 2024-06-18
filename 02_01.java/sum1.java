import java.util.*;

public class sum1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n;i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
            int sum=a[i];
            int k=i;
            for(int j=i+1;j<n;j++) {
                if(a[k]<=a[j]){
                    int tot=sum^a[j];
                    sum=sum+tot;
                    System.out.println(tot+" "+sum);
                }
                else{
                    al.add(sum);
                    break;
                }
                k=k+1;
             
            }
        }
        System.out.println(Collections.max(al));
    }
}
