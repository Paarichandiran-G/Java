import java.util.*;
public class MrString {
    static int vowel[][]={{2,1,1,2,2,2,1,2,2,2},
                          {1,3,2,3,4,3,3,4,4,4},
                          {0,1,1,1,1,1,1,2,2,2}};
    static int count(int n){
        if(n<10){
            return vowel[0][n];
        }
        if(n<20){
            return vowel[1][n%10];
        }
        if(n==100){
            return 2;
        }
        if(n%10==0){
            return vowel[2][(n/10)];
        }
        return vowel[2][n/10]+vowel[0][n%10];
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d=0;
        for(int i=0;i<n;i++){
            d+=count(arr[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==d){
                    ans++;
                }
            }
        }
        System.out.println(digit[ans]);
    }
}