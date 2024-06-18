import java.util.*;
public class sum27 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("common elements  of Two array");
    int n=sc.nextInt();
    int[] a1=new int[n];
    int[] a2=new int[n];
    Set<Integer> set1=new TreeSet<>();
    Set<Integer> set2=new TreeSet<>();
    for(int i=0; i<n; i++){
        set1.add(sc.nextInt());
    }
    for(int i=0; i<n; i++){
        set2.add(sc.nextInt());
    }
    set1.retainAll(set2);
    if(set1.isEmpty()){
        System.out.print("No common elements");
    }
    else{
    System.out.print(set1);
    }
  }   
}