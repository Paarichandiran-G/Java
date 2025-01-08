package dsa;

import java.util.*;
public class insertionsort {
    public static void main(String[] args) {
        int[] a={5,3,2,1,4,0,9};
        for(int i=1;i<a.length;i++){
             for(int j=i;j>0;j--){
                if(a[j]<a[j-1]&&j-1>=0){
                    int t=a[j-1];
                     a[j-1]=a[j];
                     a[j]=t;
                }
                else{
                    break;
                }
             }
            for(int x=0;x<a.length;x++){
                System.out.print(a[x]+" ");
            }
            System.out.println();
        }
    }
}