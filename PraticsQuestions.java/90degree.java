import java.util.*;
public class 90degree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        n=n.replace("[[","[").replace("]]","]").replace("],","] ");
        String[] s=n.split(" ");
        String ss=s[0].replace("[","").replace("]","").replace(","," ");
        String[] sss=ss.split(" ");
         int a[][]=new int[s.length][sss.length];
        for(int i=0;i<s.length;i++){
           String temp=s[i];
           temp=temp.replace("[","").replace("]","").replace(","," ");
           String[] x=temp.split(" ");
           for(int j=0;j<sss.length;j++){
               int y=Integer.parseInt(x[j]);
               a[i][j]=y;
           }
        }
        int[][] arr=new int[s.length][sss.length];
        int k=0;
        String str="[";
        for(int i=s.length-1;i>=0;i--){
            ArrayList<Integer> l=new ArrayList<Integer>();
            for(int j=sss.length-1;j>=0;j--){
                arr[k][j]=a[j][k];
                l.add(arr[k][j]);
            }
            str=str+l;
            k++;
        }
        System.out.print(str.replace(" ","").replace("][","],[")+"]");
        
       
    }
} 