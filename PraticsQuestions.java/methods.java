import java.util.*;
public class methods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,3,4,5,6};
        int[] a={2,3,4,5,6};
        System.out.println(arr);
      //  Arrays.fill(arr,1);
        System.out.println(arr.equals(a)?1  : 0);
        System.out.println(Arrays.equals(arr,a));
        Arrays.fill(a,1);
        System.out.println(Arrays.toString(a));
    }
}
