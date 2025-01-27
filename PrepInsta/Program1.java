// Check if a Number is Positive or Negative in Java
// import java.util.*;
// import java.util.Scanner;
// class Program
// {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number : ");
//         int num=sc.nextInt();
//         if(num >0){
//             System.out.println("the number is Positive");
//         }
//         else if(num<0){
//             System.out.println("The number is Negative");
//         }
//     }
// }
import java.util.*;
import java.util.Scanner;
class Program
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        if(num ==0){
            System.out.println("the number is zero");
        }
        else{
            String result=num>0?"the number is positive":"the number is negative";
            System.out.println(result);
        }
    }
}
