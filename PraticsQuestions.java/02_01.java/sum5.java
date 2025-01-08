import java.util.*;
public class sum5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
            s.push(10);
            s.push(1);
            s.push(5);
            s.push(13);
            s.push(6);
            
            int a=s.get(0);
            int b=s.get(s.size()-1);
            System.out.println(s);
            System.out.println("swap elements"+a+" "+b);
            s.set(0,b);
            s.set(s.size()-1,a);
            System.out.println("After swap "+s);
        // int n=sc.nextInt();
        // System.out.println("** Printing the pattern... **");
        // int k=0;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n;j++){
        //         if(i==j||j==n){
        //             System.out.print("1 ");
        //         }
        //         else if(j>i&&j<n){
        //             System.out.print(k+" ");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     k++;
        //     System.out.println();
        // }



        // int a=2^3;
        // System.out.println(a);

    }
}