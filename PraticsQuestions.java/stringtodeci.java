import java.util.*;
public class stringtodeci{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int x=0;x<n;x++){
       String s=sc.next();
           String[] str={" ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
           for(int k=0;k<s.length();k++){
              char ch=s.charAt(k);
               for(int i=1;i<str.length;i++){
                String temp=str[i];
                 for(int j=0;j<temp.length();j++){
                   char c=temp.charAt(j);
                   if(c==ch){
                       System.out.print(i+1);
                       break;
                   }
                   
               }
           }
       }
    
           System.out.println();
       }
    
    }
}