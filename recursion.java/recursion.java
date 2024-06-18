public class recursion {
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        int ans=fibo(6);
        System.out.print(ans);
    }
}
