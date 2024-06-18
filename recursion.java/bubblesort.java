import java.util.*;
public class bubblesort {
    static void bubblesort(int[] arr,int l,int index){
          if(l==0){
            return;
          }
          if(l>index){
            if(arr[index]>arr[index+1]){
                int temp=arr[index];
                arr[index]=arr[index+1];
                arr[index+1]=temp;
                for(int i=0;i<=l;i++){
                  System.out.print(arr[i]);
                }
                System.out.println();
            }
            bubblesort(arr,l,index+1);
          }
          else{
            bubblesort(arr,l-1,0);
          }
    }
    public static void main(String[] args){
       // Scanner sc=new Scanner(System.in);
        int[] arr={4,3,2,1};
        bubblesort(arr,arr.length-1,0);
        System.out.print(Arrays.toString(arr));
    }
}
