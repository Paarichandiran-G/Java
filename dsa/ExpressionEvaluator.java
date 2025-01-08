import java.util.*;
public class ExpressionEvaluator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int  a=cal(s);
        System.out.println(a);
    }
    public static int cal(String s) {
        Stack<Integer> op=new Stack<>();
        Stack<Character> ot=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);;
            if(c=='('){
                ot.push(c);
            }
            else if(Character.isDigit(c)){
                StringBuilder sb=new StringBuilder();
                sb.append(c);
                while(i+1<s.length()&&Character.isDigit(s.charAt(i+1))){
                     sb.append(s.charAt(i+1));
                     i++;
                }
                op.push(Integer.parseInt(sb.toString()));
            }
            else if((c=='+'||c=='-'||c=='*'||c=='/')){
                while(!ot.isEmpty()&&haspre(c,ot.peek())){
                    int  b=op.pop();      
                    int  a=op.pop(); 
                  op.push(apply(a,b,ot.pop())); 
                }
                ot.push(c);    
            }
            else if(c==')'){
                while(ot.peek()!='('){
                    int  b=op.pop();      
                    int a=op.pop(); 
                    op.push(apply(a,b,ot.pop())); 

                }
                ot.pop();
            }
        }
        while(!ot.isEmpty()){
            int  b=op.pop();      
            int  a=op.pop(); 
            op.push(apply(a,b,ot.pop())); 
        }
        return op.pop();
    }//hihhi
    private static boolean haspre(char c1,char c2 ){
        if(c2=='('||c2==')'){
            return false;
        }  
        if((c1=='*'||c1=='/')&&(c2=='+'||c2=='-')){
            return false;
        }
        return true;
    }
    private static Integer apply(int  a,int  b,char c){
        switch(c){
             case '+':
             return a+b;
             case '-':
             return a-b;
             case '*':
             return a*b;
             case '/':
             if(b==0){
                throw new ArithmeticException("division by zero");
             }
             return a/b;
             default:
                throw new IllegalArgumentException("Illegal character");
        }
    }
}
// // import java.util.*;

// // public class exp {
// //     public static void main(String[] args) {
// //         Scanner scanner = new Scanner(System.in);
// //         System.out.println("Enter the expression:");
// //         String expression = scanner.nextLine();

// //         double result = evaluateExpression(expression);
// //         System.out.println("Result: " + result);

// //         scanner.close();
// //     }

//     public static double evaluateExpression(String expression) {
//         Stack<Double> operands = new Stack<>();
//         Stack<Character> operators = new Stack<>();

//         for (int i = 0; i < expression.length(); i++) {
//             char ch = expression.charAt(i);

//             if (ch == '(') {
//                 operators.push(ch);
//             } else if (Character.isDigit(ch)) {
//                 StringBuilder num = new StringBuilder();
//                 num.append(ch);
//                 while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
//                     num.append(expression.charAt(i + 1));
//                     i++;
//                 }
//                 operands.push(Double.parseDouble(num.toString()));
//             } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
//                 while (!operators.isEmpty() && hasPrecedence(ch, operators.peek())) {
//                     double b = operands.pop();
//                     double a = operands.pop();
//                     operands.push(applyOperator(a, b, operators.pop()));
//                 }
//                 operators.push(ch);
//             } else if (ch == ')') {
//                 while (operators.peek() != '(') {
//                     double b = operands.pop();
//                     double a = operands.pop();
//                     operands.push(applyOperator(a, b, operators.pop()));
//                 }
//                 operators.pop(); // Pop '('
//             }
//         }

//         while (!operators.isEmpty()) {
//             double b = operands.pop();
//             double a = operands.pop();
//             operands.push(applyOperator(a, b, operators.pop()));
//         }

//         return operands.pop();
//     }

//     private static boolean hasPrecedence(char op1, char op2) {
//         if (op2 == '(' || op2 == ')') {
//             return false;
//         }
//         if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
//             return false;
//         }
//         return true;
//     }

//     private static double applyOperator(double a, double b, char operator) {
//         switch (operator) {
//             case '+':
//                 return a + b;
//             case '-':
//                 return a - b;
//             case '*':
//                 return a * b;
//             case '/':
//                 if (b == 0) {
//                     throw new ArithmeticException("Division by zero");
//                 }
//                 return a / b;
//             default:
//                 throw new IllegalArgumentException("Invalid operator: " + operator);
//         }
//     }
// }

// import java.util.*;

// public class ExpressionEvaluator{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the expression:");
//         String expression = scanner.nextLine();

//         double result = evaluateExpression(expression);
//         System.out.println("Result: " + result);

//         scanner.close();
//     }

//     public static double evaluateExpression(String expression) {
//         Stack<Double> operands = new Stack<>();
//         Stack<Character> operators = new Stack<>();

//         for (int i = 0; i < expression.length(); i++) {
//             char ch = expression.charAt(i);

//             if (ch == '(') {
//                 operators.push(ch);
//             } else if (Character.isDigit(ch)) {
//                 StringBuilder num = new StringBuilder();
//                 num.append(ch);
//                 while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
//                     num.append(expression.charAt(i + 1));
//                     i++;
//                 }
//                 operands.push(Double.parseDouble(num.toString()));
//             } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
//                 while (!operators.isEmpty() && hasPrecedence(ch, operators.peek())) {
//                     double b = operands.pop();
//                     double a = operands.pop();
//                     operands.push(applyOperator(a, b, operators.pop()));
//                 }
//                 operators.push(ch);
//             } else if (ch == ')') {
//                 while (operators.peek() != '(') {
//                     double b = operands.pop();
//                     double a = operands.pop();
//                     operands.push(applyOperator(a, b, operators.pop()));
//                 }
//                 operators.pop(); // Pop '('
//             }
//         }

//         while (!operators.isEmpty()) {
//             double b = operands.pop();
//             double a = operands.pop();
//             operands.push(applyOperator(a, b, operators.pop()));
//         }

//         return operands.pop();
//     }

//     private static boolean hasPrecedence(char op1, char op2) {
//         if (op2 == '(' || op2 == ')') {
//             return false;
//         }
//         if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
//             return false;
//         }
//         return true;
//     }

//     private static double applyOperator(double a, double b, char operator) {
//         switch (operator) {
//             case '+':
//                 return a + b;
//             case '-':
//                 return a - b;
//             case '*':
//                 return a * b;
//             case '/':
//                 if (b == 0) {
//                     throw new ArithmeticException("Division by zero");
//                 }
//                 return a / b;
//             default:
//                 throw new IllegalArgumentException("Invalid operator: " + operator);
//         }
//     }
// }
