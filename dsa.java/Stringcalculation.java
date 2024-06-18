import java.util.*;
public class Stringcalculation {
    public static int exp(String s){
        Stack<Integer> operend=new Stack<Integer>();
        Stack<Character> operator=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                operator.push(c);
            }
            else if(Character.isDigit(c)){
                StringBuffer sb=new StringBuffer();
                sb.append(c);
                while(i+1<s.length()&&Character.isDigit(s.charAt(i+1))){
                     sb.append(s.charAt(i+1));
                     i++;
                }
                operend.push(Integer.parseInt(sb.toString()));
            }
            else if(c=='+'||c=='-'||c=='*'||c=='/'){
                while(!operator.isEmpty()&&check(c,operator.peek())){
                int b=operend.pop();
                int a=operend.pop();
                operend.push(apply(a,b,operator.pop()));
                }
                operator.push(c);
                
            }
            else if(c==')'){
                while(operator.peek()!='('){
                    int  b=operend.pop();      
                    int a=operend.pop(); 
                    operend.push(apply(a,b,operator.pop())); 

                }
                operator.pop();
            
        }
    }
    while(!operator.isEmpty()){
            int b=operend.pop();
            int a=operend.pop();
            operend.push(apply(a,b,operator.pop()));

        }
        return operend.pop();
    }
    private static boolean check(char c1, char c2){
        if(c2=='('||c2==')'){
            return false;
        }
        if((c1=='*'||c1=='/')&&(c2=='+'||c2=='-')){
            return false;
        }
        return true;
    }
    private static int apply(int a,int b,char c){
        switch(c){
            case '+':
            return a + b;
            case '-':
            return a - b;
            case '*':
            return a * b;
            case '/':
            // if(b==0){
            //     throw new ArithmeticException("diving by zero");
            // }
            return a / b;
            default: {
                throw new IllegalArgumentException("Invalid operator");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=exp(s);
        System.out.print("Result"+n);
    }
}
