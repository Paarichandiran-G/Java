import java.util.*;
public class bal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            int temp=s.length()-1;
            int count=0;
            
            if(s.length()%2==0){
                for(int j=0;j<s.length()/2;j++){
                    char c1=s.charAt(j);
                    char c2=s.charAt(temp);
                    if(c1=='(' && c2==')' || c1=='[' && c2==']' || c1=='{' && c2=='}'){
                        temp--;
                        count++;
                       if(s.length()/2==count){
                        System.out.print("True");
                       }
                    }
                    else {
                        System.out.print("False");
                        break;
                    }
                }
            }
            else{
                System.out.println("False");
            }
            System.out.println();
        }
    }
}