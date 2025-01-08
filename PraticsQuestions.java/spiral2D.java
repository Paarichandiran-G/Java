import java.util.*;
public class spiral2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
              arr[i][j]=sc.nextInt();
            }
        }
        int top=0;
        int down=n-1;
        int left=0;
        int right=m-1;
        while(top<=down && left<=right){
        for(int i=top;i<=down;i++){
            System.out.print(arr[i][left]+" ");
        }
        left++;
        for(int j=left;j<=right;j++){
            System.out.print(arr[down][j]+" ");
        }
        down--;
        if(left<=right){
        for(int k=down;k>=top;k--){
            System.out.print(arr[k][right]+" ");
        }
        right--;
        }
         if(top<=down){
        for(int l=right;l>top;l--){
            System.out.print(arr[top][l]+" ");
        }
        
        top++;
    }
        //top++;  
    }
    }
}
