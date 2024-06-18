import java.util.*;
public class collections{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //list interface
       /* ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        for(int s:a){
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println(a.get(0));
        a.remove(0);
        System.out.println(a);
        a.add(0,1);
        System.out.println(a);
        a.set(0,2);
        System.out.println(a);
        a.clear();
        System.out.println(a);
        
       LinkedList<String> a=new LinkedList<String>();
       a.add("p");
       a.add("a");
       a.add("a");
       a.add("r");
       a.add("i");
       for(Object b:a){
        System.out.print(b+" ");
       }
       System.out.println();
       Collections.sort(a);
       System.out.println(a);
       Collections.rotate(a,2);
       System.out.println(a);
       */

      //set interface types hashset,linkedHashset

    /*  HashSet<Integer> a=new HashSet<Integer>();
      a.add(3);
      a.add(3);
      a.add(6);
      a.add(9);
      a.add(1);
      System.out.println(a);
      System.out.println(a);
      */
     //linkedHashset is dupilcate allow and index conceptuse

     
    LinkedHashSet<Integer> a=new LinkedHashSet<Integer>();
      a.add(3);
      a.add(3);
      a.add(6);
      a.add(9);
      a.add(1);
      System.out.println(a);
      System.out.println();

    }
}