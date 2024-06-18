import java.util.Scanner;

public class sumofallnumbers {
    static int sum(int n){
        if(n!=0){
            return n+sum(n-1);
        }
        else{
            return n;
        }
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        int n=sum(5);
        System.out.println(n);
       
    }
}
