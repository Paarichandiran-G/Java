import java.util.*;
public class compareTo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Integer[] a={2,3,1,0,4};
        Arrays.sort(a, (x, y) -> y.compareTo(x));
        for(int num:a){
            System.out.println(num);
        }
    }
}