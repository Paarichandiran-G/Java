import java.util.*;
public class telephone{
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==1)
        {
            System.out.print("No Combination of Strings");
        }
        else{
        Map<Integer,String>m1=new HashMap<Integer,String>();
        char ch='a';
        int m=0;
        String s1="";
        for(int i=2;i<=9;i++)
        {
            if(i==7||i==9)
            m=4;
            else
            m=3;
            for(int j=0;j<m;j++)
            {
               s1=s1+ch;
               ch++;
            }
           m1.put(i,s1);
            s1="";
        }
        String s2="",s3="",s4="";
        int l=(int)Math.log10(n)+1;
        if(l==1)
        {
            s2=m1.get(n);
            for(int i=0;i<s2.length();i++)
            {
                System.out.print(s2.charAt(i)+" ");
            }
        }
        else
    
        {
            s3=m1.get(n/10);
            s4=m1.get(n%10);
            for(int i=0;i<s3.length();i++)
            {
                for(int j=0;j<s4.length();j++)
                {
                    System.out.print(s3.charAt(i)+""+s4.charAt(j)+" ");
                }
            }
        }
    }
    }
}
