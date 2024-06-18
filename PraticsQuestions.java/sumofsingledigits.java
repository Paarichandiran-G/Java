import java.util.*;
public class sumofsingledigits{
    static long sumofdigits(long o){
        long sum=o;
        while(sum>=10){
            sum=callfunction(sum);
        }
        return sum;
    }
    static long callfunction(long p){
        long sum=0;
        while(p!=0){
            sum=sum+p%10;
            p=p/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        for(int i=0;i<s.length;i++){
            long o=Long.parseLong(s[i]);
            long a=sumofdigits(o);
            if(a%2!=0){
                System.out.print((char)(a+97-1));
            }
            else{
                System.out.print(a);
            }
            
        }
    }
}

