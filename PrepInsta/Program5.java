// // Sum of numbers in a given range
// import java.util.*;
// import java.util.Scanner;
// public class Program5 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number1 : ");
//         int num1=sc.nextInt();
//         System.out.print("Enter the number2 : ");
//         int num2=sc.nextInt();
//         int sum=0;
//         for(int i=num1;i<=num2;i++){
//             sum = i+sum;
//         }
//         System.out.print("the sum of range : "+sum);
//     }
    
// }
public class Program5
{
  public static void main (String[]args)
  {
    int a = 5;
    int b = 10;

    int sum = getSum (0, a, b);
      System.out.println ("The sum is " + sum);
  }


  static int getSum (int sum, int i, int b)
  {

    // stop when any recursion call tries to go over b (larger number)
    if (i > b)
      return sum;

    return i + getSum (sum, i + 1, b);
  }
}/*Execution Trace:
Variables Initialization:
a = 5
b = 10
Step 1: sum = getSum(0, 5, 10)

Call getSum(0, 5, 10):
i (5) ≤ b (10) → Proceed to recursive case.
Return: 5 + getSum(0, 6, 10)
Step 2: getSum(0, 6, 10)

Call getSum(0, 6, 10):
i (6) ≤ b (10) → Proceed to recursive case.
Return: 6 + getSum(0, 7, 10)
Step 3: getSum(0, 7, 10)

Call getSum(0, 7, 10):
i (7) ≤ b (10) → Proceed to recursive case.
Return: 7 + getSum(0, 8, 10)
Step 4: getSum(0, 8, 10)

Call getSum(0, 8, 10):
i (8) ≤ b (10) → Proceed to recursive case.
Return: 8 + getSum(0, 9, 10)
Step 5: getSum(0, 9, 10)

Call getSum(0, 9, 10):
i (9) ≤ b (10) → Proceed to recursive case.
Return: 9 + getSum(0, 10, 10)
Step 6: getSum(0, 10, 10)

Call getSum(0, 10, 10):
i (10) ≤ b (10) → Proceed to recursive case.
Return: 10 + getSum(0, 11, 10)
Step 7: getSum(0, 11, 10)

Call getSum(0, 11, 10):
i (11) > b (10) → Base case is met.
Return: 0.
Recursive Returns (Unwinding):
getSum(0, 10, 10) returns 10 + 0 = 10
getSum(0, 9, 10) returns 9 + 10 = 19
getSum(0, 8, 10) returns 8 + 19 = 27
getSum(0, 7, 10) returns 7 + 27 = 34
getSum(0, 6, 10) returns 6 + 34 = 40
getSum(0, 5, 10) returns 5 + 40 = 45
 */