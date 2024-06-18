import java.util.*;
public class grandchild{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[][] str=new String[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                str[i][j]=sc.next();
            }
        }
        String s=sc.next();
        ArrayList<String> a=new ArrayList<String>();
        for(int i=0;i<n;i++){
            for(int j=1;j<2;j++){
                String s1=str[i][j];
                if(s1.equals(s)){
                    String s2=str[i][0];
                    a.add(s2);
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<2;j++){
                if(a.contains(str[i][j])){
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}