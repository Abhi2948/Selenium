// import java.util.*;
// import java.util.Scanner;
// public class Program7 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the num1 : ");
//         int num1=sc.nextInt();
//         System.out.print("enter the num2 : ");
//         int num2=sc.nextInt();
//         System.out.print("enter the num3 : ");
//         int num3=sc.nextInt();
//         if(num1>=num2 && num1>=num3)
//         System.out.print("greatest is num1 "+num1);
//         else if(num2>=num3 && num2>=num1)
//         System.out.print("greatest is num2 "+num2);
//         else if(num3>=num2 && num3>=num1)
//         System.out.print("greatest is num3 "+num3);
//     }
// }
import java.util.*;
import java.util.Scanner;
public class Program7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num1 : ");
        int num1=sc.nextInt();
        System.out.print("enter the num2 : ");
        int num2=sc.nextInt();
        System.out.print("enter the num3 : ");
        int num3=sc.nextInt();
        int temp,result;
        temp=num1>num2?num1:num2;
        result=temp>num3?temp:num3;
        System.out.print(result+"is the greatest");
    }
}
