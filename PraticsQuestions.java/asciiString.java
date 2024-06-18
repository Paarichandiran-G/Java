import java.util.*;
public class asciiString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int k=sc.nextInt();
        String s=str.replace("[","").replace("'","").replace("]","");
        String[] x=s.split(",");
        long sum=0;
        for(int i=0;i<x.length;i++){
            String temp=x[i];
            int y=0;
            long z=1;
            for(int j=0;j<temp.length();j++){
                char ch=temp.charAt(j);
                y=ch;
                long v=(long)Math.pow(y,k);
                z=z*v;
            }
            sum=sum+z;
        }
        if(sum%2==0){
            System.out.print("EVEN");
        }
        else{
            System.out.print("ODD");
        }
    }
}