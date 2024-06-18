package dsa;
import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []a={5,4,3,2,1};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
            for(int k=0;k<a.length;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}
