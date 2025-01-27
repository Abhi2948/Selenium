// import java.util.Scanner;
// public class Program9 {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("the number is : ");
//         int number=sc.nextInt();
//         checkPrime(number);
//     }
//     private static void checkPrime(int number)
//     {
//         int count=0;
//         if(number<2)
//         {
//             System.out.println("the give number "+number+" is not prime1");
//             System.exit(0);

//         }
//         for(int i=1;i<=number;i++)
//         {
//             if(number%i==0)
//             count+=1;
//         }
//         if(count>2)
//         {
//             System.out.println("the give number "+number+" is not prime");
//         }
//         else 
//         System.out.println("the give number "+number+" is prime");
//     }
    
// }
// public class Program9
//  {
//    public static void main (String[]args)
//    {

//      int i, n = 13;
//      boolean isprime = true;

//      // 0 and 1 are not prime numbers also, negative numbers are not prime
//      if (n < 2)
//        {
//           isprime = false;
//        }
//      else
//        {
//           for (i = 2; i < n; i++)
//            {
//             if (n % i == 0)
//              {
//               isprime = false;
//                   break;
//                 }
//         }
//        }

//      String result = isprime ? "Prime" : "not Prime";
//      System.out.println ("The number " + n + " is : " + result);

//      // Time Complexity : O(N)
//      // Space Complexity : O(1)
//      // This program is better than previous version as :
//      // Condition for 0, 1 and negative numbers checked earlier
//      // Loops runs b/w [2, n-1] rather than [1, n]

//    }
//  }
// Prime no Program in Java
// public class Program9
// {
//   public static void main (String[]args)
//   {

//     int i,n = 33;
//     boolean isprime= true;

//     // 0 and 1 are not prime numbers also, negative numbers are not prime
//     if(n < 2)
//     {
//         isprime = false;
//     }
//     else
//     {
//     // running loop till n is wasteful because for any number n the numbers in
//     // the range(n/2 + 1, n) won't be divisible anyways.
//         for(i=2; i <= n/2; i++)
//         {
//             if(n % i == 0)
//             {
//                 isprime = false;
//                 break;
//             }
//         }
//     }

//     String result = isprime ? "Prime" : "not Prime";
//     System.out.println ("The number " + n + " is : " + result);

//     // Time Complexity : O(N)
//     // Space Complexity : O(1)
//     // This program is better than previous version as :
//     // Loops runs b/w [2, n/2] rather than [2, n-1]


//   }
// }
// public class Program9
//  {
//    public static void main (String[]args)
//    {

//       int i,n = 29;
//      boolean isprime= true;

//      // 0 and 1 are not prime numbers also, negative numbers are not prime
//      if(n < 2)
//      {
//          isprime = false;
//      }
//      else
//      {
//      // If a number n is not a prime, it can be factored into two factors a and b:
//      // n = a * b

//      /*Now a and b can't be both greater than the square root of n, 
//      since then the product a * b would be greater than sqrt(n) * sqrt(n) = n.
//      So in any factorization of n, at least one of the factors must be smaller 
//      than the square root of n, and if we can't find any factors less than or equal to 
//      the square root, n must be a prime.*/
//          for(i=2; i <= Math.sqrt(n); i++)
//          {
//              if(n % i == 0)
//              {
//                  isprime = false;
//                  break;
//              }
//          }
//      }

//      String result = isprime ? "Prime" : "not Prime";
//      System.out.println ("The number " + n + " is : " + result);

//      // Time Complexity : O(N)
//      // Space Complexity : O(1)
//      // This program is better than previous version as :
//      // Loops runs b/w [2, bn] rather than [2, n/2]


//    }
//  }
// public class Program9
//  {
//    public static void main (String[]args)
//    {

//      int n = 29;

//      if (isPrime (n))
//          System.out.println (n + " is a Prime Number");
//      else
//          System.out.println (n + " is not a Prime Number");

//    }


//    static Boolean isPrime (int n)
//    {
//      // 0 and 1 are not prime numbers
//      // negative numbers are not prime
//      if (n <= 1)
//        return false;

//      // special case as 2 is the only even number that is prime
//      else if (n == 2)
//        return true;

//      // Check if n is a multiple of 2 thus all these won't be prime
//      else if (n % 2 == 0)
//        return false;

//      // If not, then just check the odds
//      for (int i = 3; i <= Math.sqrt (n); i += 2)
//        {
//  	if (n % i == 0)
//  	  return false;
//        }

//      return true;
//    }
//  }
public class Program9
{
  public static void main (String[]args)
  {

    int i = 2;
    boolean isprime= true;
    
    int n = 37;
    isprime=checkPrime(n, i);
    
    String result = isprime ? "Prime":"not Prime";
    System.out.println(n + " is : "+ result); 

  }


  static Boolean checkPrime(int n, int i)
{
    // 0, 1 and negative numbers are not prime
    if (n < 2)
        return false;

    // if this satisfies then its prime as we
    // have completed recursion from 2 to n
    if (i == n)
        return true;

    // Base cases
    if (n % i == 0)
        return false;

    i += 1;
    return checkPrime(n, i);
}
}