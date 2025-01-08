package dsa;

import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        int[] a={5,3,2,1,4};
        for(int i=0;i<a.length;i++){
            int min=a[i];
            int k=0;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    k=j;
                }
            }
            if(min!=a[i]){
                int t=a[i];
                a[i]=min;
                a[k]=t;
            }
            for(int x=0;x<a.length;x++){
                System.out.print(a[x]+" ");
            }
            System.out.println();
        }
    }
}
