import java.util.*;
public class highestfreqword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int sum=0;
        String ans="";
        for(int i=0;i<s.length;i++){
            String t=s[i];
            int count=0;
            for(int j=i+1;j<s.length;j++){
                if(t.equals(s[j])){
                    count++;
                }
            }
            if(sum<count){
                sum=count;
                ans=s[i];
            }
        }
        if(sum>0){
            System.out.print(ans);
        }
        else{
            System.out.print("None");
        }
    }
}
