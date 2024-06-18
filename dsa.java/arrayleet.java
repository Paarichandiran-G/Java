import java.util.*;

public class arrayleet {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // int a[]={1,2,3,4,5};
    // List<Integer> aList=new ArrayList<Integer>(Arrays.asList));
    // System.out.println(aList);
    // Scanner sc=new Scanner(System.in);
        // String a=sc.nextLine().replaceAll("[^0-9]","");
        // String b=sc.nextLine().replaceAll("[^0-9]","");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sol=x/y;
        int z1=sol*y;
        int z2=y*(sol+1);
        int n1=x-z1;
        int n2=z2-x;
        System.out.println(z1+" "+z2+" "+n1+" "+n2);
        if(n1<n2){
            System.out.print(z1);
        }
        else{
            System.out.print(z2);
        }
  }    
}
