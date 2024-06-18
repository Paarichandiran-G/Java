import java.util.*;
public class bit_manupulation {
    static int getBit(int n,int i){
        if((n&(1<<i))!=0){
            return 1;
        }
        return 0;
    }
    static int setBit(int n,int i){
        return (n|(1<<i));
    }
    static int unsetBit(int n,int i){
        return (n&(~(1<<i)));
    }
    static int togalBit(int n,int i){
        // if(getBit(n, i)==1){
        //     return unsetBit(n, i);
        // }
        // return setBit(n, i);

        return (n^(1<<i));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // byte a=5;
        // byte b=-10;
        // System.out.println(a&b);
        // System.out.println(a|b);
        // System.out.println((~b));
        
        
         System.out.println(getBit(12,1));

        //! odd or even
        // int n=sc.nextInt();
        // if(getBit(n, 0)==1){
        //     System.out.println("odd");
        // }
        // else{
        //     System.out.println("even");
        // }

        // if((n&1)==1){
        //     System.out.println("odd");
        // }
        // else{
        //     System.out.println("even");
        // }


        //! toggal for loop
        // boolean f=true;
        // int n=1;
        // for(int i=0;i<7;i++){
        //     if(f){
        //         System.out.println("first");
        //     }
        //     else{
        //         System.out.println("second");
        //     }
        //     //?toggaler
        //     f=f^true;
        //     n=n^1;
        // }

        //!subset
        // char str[]=sc.next().toCharArray();
        // int l=str.length;
        // int n=(int)Math.pow(2,l);
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<l;j++){
        //         if(getBit(i, j)==1){
        //             System.out.print(str[j]);
        //         }
        //     }
        //     System.out.println();
        // }

        //! remove duplicates
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum^=arr[i];
        // }
        // System.out.println(sum);

        // int a=2147483647;
        // System.out.println(a);
        // a*=2;
        // System.out.println(a);
        // sc.close();
    }
}
