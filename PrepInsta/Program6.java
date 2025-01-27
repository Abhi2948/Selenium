// //Greatest of two numbers:
// import java.util.Scanner;
// import java.util.*;
// public class Program6 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter num1 : ");
//         int num1=sc.nextInt();
//         System.out.print("enter num2 : ");
//         int num2=sc.nextInt();
//         if(num1>num2)
//         {
//             System.out.println(num1);
//         }
        
//         else if(num2>num1){
//             System.out.print(num2);
//         }
//         else if(num1==num2){
//             System.out.print("both are equal");
//         }
        

//     }
    
// }
public class Program6 {
    public static void main(String args[])
    {
        int num1 = 12, num2 = 21;
        if (num1 == num2)
            System.out.println("both are equal");
        else
            // prints the maximum of two numbers
            System.out.println(Math.max(num1, num2) + " is greater");
    }
}