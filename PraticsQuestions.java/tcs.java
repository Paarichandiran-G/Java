import java.util.*;
public class tcs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        int temp1=0;
        int count1=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j+1]<a[j]){
                    temp1=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp1;
                    count1++;
                   
                }
            }
        }
        int temp2=0;
        int count2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                 if(b[j]<b[j+1]){
                    temp2=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp2;
                    count2++;
                 }
            }
        }   
        if(count1>=count2){
            System.out.print(count2);
        }
        else{
            System.out.print(count1);
        }
        
    }
}




// int desc=0;
        // int cal=0;
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(a[i]<a[j]){
        //         desc=a[i];
        //         a[i]=a[j];
        //         a[j]=desc;
        //         cal++;
        //         }
        //         for(int x=0;x<n;x++){
        //             System.out.print(a[x]);
        //         }
        //         System.out.println();
                
        //     }
        // }






        /*import java.util.*;
public class best_sorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp=0;
        int count=0;
        for(int i=0;i<n;i++){
         // int sum=0;
            for(int j=0;j<n-1;j++){
                if(a[j+1]<a[j]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                 // sum=1;
                    count++;
                }
            }
          //if(sum==0){
          //  break;
         // }
        }   
        int k=n*(n-1)/2-count;
        if(count>=k){
          System.out.print(k);
        }
        else{
          System.out.print(count);
        }
    }
}
*/
