
import java.util.*;
public class uft_8encoding{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String num[]=sc.nextLine().replaceAll("[\\[\\] ]","").split(",");
        int n=num.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(num[i]);
        }
        for(int i=0;i<n;i++){
            int bit=0;
            int mask=1<<7;
            while((arr[i]&mask)!=0){
                bit++;
                mask>>=1;
            }
            int lim=i+bit;
            if(lim>=n){
                System.out.println("false");
                return;
            }
            for(int j=i+1;j<lim && j<n;j++){
                if(!(((arr[j]&(1<<7))!=0) && ((arr[j]&(1<<6))==0))){
                    System.out.println("false");
                    return;
                }
                i++;
            }
        }
        System.out.println("true");
    }
}




