import java.util.*;
class Maze{
    int maze[][];
    int ans[][];
    Maze(int n,int m,Scanner sc){
        // Scanner sc=new Scanner(System.in);
        maze=new int[n][m];
        ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                maze[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
    boolean solveMaze(int i,int j){
        int n=maze.length;
        int m=maze[0].length;
        if(i<0||i>=n|| j<0 || j>=m || maze[i][j]==1 || ans[i][j]==1){
            return false;
        }
        if(i==maze.length-1 && j==maze[0].length-1){
            ans[i][j]=1;
            return true;
        }
        ans[i][j]=1;
        if(solveMaze(i+1,j) || solveMaze(i,j+1) || solveMaze(i-1,j) || solveMaze(i,j-1)){
            return true;
        }
        ans[i][j]=0;
        return false;
    }
}
public class fourdirection{
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Maze maz=new Maze(n,m,sc);
        maz.solveMaze(0,0);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(maz.ans[i][j]+" ");
            }
            System.out.println();
        }
      }
}

