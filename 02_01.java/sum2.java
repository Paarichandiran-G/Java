import java.util.*;
public class sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
            s.push(10);
            s.push(1);
            s.push(5);
            s.push(13);
            s.push(6);
            System.out.println(s);
            System.out.println("After sort");
            Collections.sort(s);
            System.out.println(s);
            
    }
}
