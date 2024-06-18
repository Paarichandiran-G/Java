
import java.util.*;
public class bit_graycode{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String nums[]=sc.nextLine().replaceAll("[\\[\\] ]","").split(",");
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(nums[i]);
        }
        if(arr[0]!=0){
            System.out.println("false");
            return;
        }
        for(int i=0;i<n-1;i++){
            int res=arr[i]^arr[i+1];
            if((res&(res-1))!=0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}