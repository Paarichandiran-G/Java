import java.util.*;
import java.math.BigInteger;
public class sum23 {
    public static BigInteger fact(int n) {
        BigInteger f = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
          f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("factorial of number");
        int n = sc.nextInt();
        BigInteger i = fact(n);
        System.out.println(i);
    }
}
