// import java.util.*;
// public class functions {
//     public static void main(String[] args){
//         int[] arr={2,4,5,67,56};
//         change(arr);
//         System.out.print(Arrays.toString(arr));
//     }
//     // static void change(int[] num){
//     //     num[3]=6;
//     //     num[1]=0;
//     // }
// }

// import java.util.*;
// public class functions{
//     public static void main(String[] args){
//         int a=10;
//         int b=20;
//         {
//             a=50;
//             System.out.println(a+" "+b);
//             b=25;
//         }
     
//         System.out.print(a+" "+b);

//     }
// }




// import java.util.*;
// public class functions{
//     static int a=10;//this int scope block{}
//     public static void main(String[] args){
//         System.out.println(a);//10
//         int a=20;       //this int scope only block{}
//         System.out.println(a);20//
//         fun();
//     }
//     static void fun(){
//         System.out.print(a);//10
//     }
// }




// import java.util.*;
// public class functions{
//     public static void main(String[] args){
//        fun(2,3,5,6,78,5);
//     }
//     static void fun(int ...v){
//         System.out.print(Arrays.toString(v));[2, 3, 5, 6, 78, 5]
//     }
// }