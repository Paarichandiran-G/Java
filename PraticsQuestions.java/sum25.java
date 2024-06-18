import java.util.*;
public class sum25 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Union of Two array");
    int n=sc.nextInt();
    int[] a1=new int[n];
    int[] a2=new int[n];
    Set<Integer> set=new TreeSet<>();
    for(int i=0; i<n; i++){
        set.add(sc.nextInt());
    }
    for(int i=0; i<n; i++){
        set.add(sc.nextInt());
    }
    System.out.print(set);
  }   
}
