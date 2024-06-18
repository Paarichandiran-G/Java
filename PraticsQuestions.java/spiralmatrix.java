import java.util.*;
public class spiralmatrix{ //rotate
    static void rotate(int arr[][],int n,int m){
        int r_st=0;
        int r_ed=n-1;
        int c_st=0;
        int c_ed=m-1;
        while(r_st<r_ed && c_st<c_ed){
            int temp=-1;
            for(int i=r_st;i<r_ed;i++){
                temp=temp+arr[i][c_st];
                arr[i][c_st]=temp-arr[i][c_st];
                temp=temp-arr[i][c_st];
            }
            for(int i=c_st;i<c_ed;i++){
                temp=temp+arr[r_ed][i];
                arr[r_ed][i]=temp-arr[r_ed][i];
                temp=temp-arr[r_ed][i];
            }
            for(int i=r_ed;i>r_st;i--){
                temp=temp+arr[i][c_ed];
                arr[i][c_ed]=temp-arr[i][c_ed];
                temp=temp-arr[i][c_ed];
            }
            for(int i=c_ed;i>=c_st;i--){
                temp=temp+arr[r_st][i];
                arr[r_st][i]=temp-arr[r_st][i];
                temp=temp-arr[r_st][i];
            }
            r_st++;
            r_ed--;
            c_st++;
            c_ed--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        while(k-->0){
            rotate(arr,n,m);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}