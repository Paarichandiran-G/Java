import java.util.*;
public class longestPalindromeSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] c = str.toCharArray();
        int longest=0;
        int startIndex=0;
        int EndIndex=0;
        // String[] s=sc.next().\
        int[][] dp =new int[c.length][c.length];
        for(int i=0; i<dp.length; i++){
            for(int j=0;j+i<dp.length;j++){
                if(i==0){
                    dp[j][j]=1;
                }
                else if(i==1 && c[j]==c[j+1]){
                    dp[j][j+1]=2;
                    longest=2;
                    startIndex=j;
                    EndIndex=j+1;
                }
                else if(c[j]==c[j+i] && dp[j+1][j+i-1]!=0){
                    dp[j][j+i]=dp[j+1][j+i-1]+2;
                    if(dp[j][j+i]>longest){
                        longest=dp[j][j+i];
                        startIndex=j;
                        EndIndex=j+i;
                    }
                }
            }
        }
        System.out.println(str.substring(startIndex, EndIndex+1));
        for(int i=0; i<dp.length; i++){
            for(int j=0;j<dp.length;j++){
              System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
