import java.util.*;
public class sum20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] s2=s.split(" ");
        int x=s2[0].length(); 
        int y=s2[0].length();
        int max=0;
        int min=0;
        
        for(int i=0; i<s2.length; i++) {
             int a=s2[i].length();
             int b=s2[i].length();
             if(x>a){
                x=a;
                min=i;
             }
             if(y<b){
                y=b;
                max=i;
             }

        }
        System.out.println("largest : "+s2[max]);
         System.out.println("Smallest : "+s2[min]);

    }
}
