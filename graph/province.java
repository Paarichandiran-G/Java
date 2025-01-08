import java.util.*;
public class province {
    static void dfs(int[][] arr,int curr,boolean[] vis){
        vis[curr]=true;
        for(int i=0;i<arr.length;i++){
            if(arr[curr][i]==1&& !vis[i]){
                dfs(arr,i,vis);
            }
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        // int[][] arr=new int[n][m];
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<m;j++) {
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        //[[1 1 0][1 1 0][0 0 1]]
        int[][] arr={{1,0,0},{0,0,1},{1,0,1}};
        boolean[] vis=new boolean[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(!vis[i]){
                count++;
                dfs(arr,i,vis);
            }
        }
        System.out.println(count);
    }
}
