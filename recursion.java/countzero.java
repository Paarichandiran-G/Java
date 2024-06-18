import java.util.Scanner;

public class countzero {
   static int count=0;
   static int c(int n){
   if(n%10==0 && n!=0){
      count++;
   }
   if(n==0){
     return 0; 
   }
   c(n/10);
   return count;
}
 public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=c(n);
    System.out.print(a);
 }   
}
