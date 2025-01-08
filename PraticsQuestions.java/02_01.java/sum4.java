import java.util.*;
public class sum4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
            s.push(10);
            s.push(1);
            s.push(5);
            s.push(13);
            s.push(6);
            if(s.contains(10)){
                System.out.println("present");
            }
            else{
                System.out.println("not present");
            }
    }
}