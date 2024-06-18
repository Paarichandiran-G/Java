import java.util.*;
public class alphabet{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.length()<26){
            System.out.print("-1");
            return;
        }
        String t="";
        int count=0;
        int k=26;
        String s="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(i<k && c==s.charAt(i)){
                t=t+c;
                count++;
            }
            else if(i<k && c=='?'){
                t=t+s.charAt(count);
                count++;
            }
            else{
                t=t+c;
            }
        }

          System.out.print(t);  
        }
    }