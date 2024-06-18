// import java.util.*;
// public class fibo{
//     static int a=0,b=1,c;
//     static int fib(int n){
//         if(n==0)
//         return a;
//        for(int i=2;i<=n;i++){
//            c=a+b;
//            a=b;
//            b=c;
//        }
//        return b;
        
//     }
//     int birds=10;
//     fibo(){
//         this(20);
//        // System.out.println("pen="+a);
//     }
//     public static void main(String[]  args){
//          Scanner sc=new Scanner(System.in);
//          fibo g=new fibo();
//         // int n=sc.nextInt();
//         // int sol=fib(n);
//         // int div=sol/10;
//         // int rem=sol%10;
//         // div=div%10;
//         // String str=div+""+rem;
//         // System.out.print(str);
//     }
// }
import java.util.*;
public class fibo{
    static long a=1,b=2,c;
    static long fibo(long n){
        if(n==0){
            return a;
        }
        for(long i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long f=fibo(n);
        System.out.print(f);
    }
}