package dsa;
import java.util.*;
public class binarySearching {
    // private static int target;

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8};
        int left=0;
        int right=arr.length-1;
        int target=7;
        while(left<=right){
            //  int mid=left+(right-left)/2;
            int mid=(left+right)/2;
             System.out.println(" mid index "+mid);
             if(arr[mid]==target){
                System.out.println(" index : "+mid);
                return;
             }
             else if(arr[mid]>target){
                 right=mid-1;
             }
             else{
                left=mid+1;
             }
        }
        System.out.println("-1");
        
    }
}
