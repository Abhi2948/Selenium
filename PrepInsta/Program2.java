// Java Program to Check Whether a Number is Even or Odd
// import  java.util.*;
// import java.util.Scanner;
// public class Program2 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//          System.out.println("Enter the number : ");
//         int num = sc.nextInt();
       
//         if(num%2==0){
//             System.out.println("the number is even");

//         }
//         else{
//             System.out.println("the number is odd");
//         }


//     }
    
// }
// import  java.util.*;
// import java.util.Scanner;
// public class Program2 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//          System.out.println("Enter the number : ");
//         int num = sc.nextInt();
//        String status = num%2==0 ?" is Even":" Is Odd";
//        System.out.println(num + status);
//     }
    
// }
import  java.util.*;
import java.util.Scanner;
public class Program2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int num = sc.nextInt();
       if(isEven(num))
       System.out.println("Even");
       else
       System.out.println("is odd");
    }
    static boolean isEven(int num)
    {
        return(num &1)==0;
    }
    
}
