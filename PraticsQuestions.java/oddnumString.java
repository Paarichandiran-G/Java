import java.util.*;
public class oddnumString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        String emp1="";
        String emp2="";
        for(int i=0;i<s.length();i++){
            String str=""+s.charAt(i);
            int a=Integer.parseInt(str);
            if(a%2!=0){
                emp1=emp1+emp2+str;
                // System.out.println(",,,"+emp1);
                emp2="";
                c++;
            }
            else if(c>0){
                emp2=emp2+str;
                // System.out.println("..."+emp2);
            }
        }
        if(c==0){
            System.out.print("Odd Number doesn't exist");
        }
        else{
            System.out.print(emp1);
        }
    }
}