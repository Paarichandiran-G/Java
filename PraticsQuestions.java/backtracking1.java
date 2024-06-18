import java.util.*;
public class backtracking1 {
    static int n;
    static boolean findpath(int i,int j,int[][] a,int[][] sol){
             if(i==n-1&&j==n-1&&a[n-1][n-1]==0){
                sol[i][j]=1;
                return true;
                 }
             if(i>=0&&j>=0&&i<n&&j<n&&a[i][j]==0){
                       sol[i][j]=1;
                       if(findpath(i,j+1,a,sol)){
                            return true;
                           }
                           if(findpath(i+1,j,a,sol))
                                return true;   
                           sol[i][j]=0;
                           return false;
        
                     }
                     return false;
        
            }
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=4;
        int[][] a={{0,0,1,1},{0,1,1,1},{0,0,0,1},{1,1,0,0}};
        int sol[][]=new int[n][n];
        if(findpath(0,0,a,sol)){
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
                                System.out.print(sol[i][j]+" ");
                            }
                            System.out.println();
                        }
                    }
                    else{
            System.out.print("No solution exits");
        }
    }
}
















// import java.util.*;
// public class backtracking1{
//     static int n;
//     static boolean findpath(int i,int j,int a[][],int sol[][]){
//         if(i==n-1&&j==n-1&&a[i][j]==0){
//         sol[i][j]=1;
//         return true;
//         }
//         if(i<n&&j<n&&a[i][j]==0){
//             sol[i][j]=1;
//             if(findpath(i,j+1,a,sol)){
//                 return true;
//             }
//             if(findpath(i+1, j, a, sol)){
//                 return true;
//             }
//             sol[i][j]=0;
//             return false;
//         }
//         return false;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         n=4;
//         int a[][]={{0,0,1,1},{0,1,1,1},{0,1,1,1},{0,0,0,0}};
//         int sol[][]=new int[n][n];
//         if(findpath(0,0,a,sol)){
//             for(int i=0;i<n;i++){
//                 for(int j=0;j<n;j++){
//                     System.out.print(sol[i][j]+" ");
//                 }
//                 System.out.println();
//             }
//         }
//         else{
//             System.out.println("no exits");
//         }
//     }
// }

//              }
