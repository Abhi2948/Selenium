// import java.util.Scanner;
// public class Program13 {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int num=sc.nextInt();
//         /**121 */
//         int reverse=0,rem,temp;
//         temp=num;
//         while(temp!=0){
//             rem=temp%10;
//             reverse=reverse*10+rem;
//             temp/=10;
//         };
//         if(num==reverse)
//         System.out.println(num+" is palindrome");
//         else 
//         System.out.println(num+" is not palindrome");
//     }
    
// }
// import java.util.Scanner;
// public class Program13{
//     public static void main(String[] args){
//         int num=12021,reverse=0,rem,temp;
//         if(getReverse(num,reverse)==num)
//         System.out.println(num+"is Palindrome");
//         else 
//         System.out.println(num+" is not");
//     }
//     static int getReverse(int num,int rev){
//         if(num==0)
//         return rev;
//         int rem=num%10;
//         rev=rev*10+rem;
//         return getReverse(num/10, rev);
//     }
// }
// class Program13{
// public static void main(String args[]){
//     System.out.println(isPalindrome("radar".toLowerCase()));
//     System.out.println(isPalindrome("Naman".toLowerCase()));
//     System.out.println(isPalindrome("12321".toLowerCase()));
//     System.out.println(isPalindrome("12345".toLowerCase()));
// }
// private static boolean isPalindrome(String string){
//     String reversed=new StringBuilder(string).reverse().toString();
//     return string.equals(reversed);
// }
// }
// class Program13{
//     public static void main(String args[]){
//         System.out.println(isPalindrome("radar".toLowerCase()));
//         System.out.println(isPalindrome("Naman".toLowerCase()));
//         System.out.println(isPalindrome("12321".toLowerCase()));
//         System.out.println(isPalindrome("12345".toLowerCase()));
//     }
//     private static boolean isPalindrome(String original){
//         String reversed="";
//         int len=original.length();
//         for(int i=len-1;i>=0;i--){
//             reversed=reversed+original.charAt(i);
//         }
//         return original.equals(reversed);
//     }
// }
// class Program13{
//     public static void main(String args[]){
//         System.out.println(isPalindrome("radar".toLowerCase()));
//         System.out.println(isPalindrome("Naman".toLowerCase()));
//         System.out.println(isPalindrome("12321".toLowerCase()));
//         System.out.println(isPalindrome("12345".toLowerCase()));
//     }
//     private static boolean isPalindrome(String original){
//         char[] data=original.toCharArray();
//         int i=0;
//         int j=data.length-1;
//         while(j>i){
//             if(data[i]!=data[j]){
//                 return false;

//             }
//             ++i;
//             --j;
//         }
//         return true;
//     }
// }
import java.util.Stack;
class Program13{
    public static void main(String args[]){
        System.out.println(isPalindrome("radar".toLowerCase()));
        System.out.println(isPalindrome("Naman".toLowerCase()));
        System.out.println(isPalindrome("12321".toLowerCase()));
        System.out.println(isPalindrome("12345".toLowerCase()));
    }
    private static boolean isPalindrome(String original){
       char[] data=original.toCharArray();
       Stack stack=new Stack<>();
       for(char c:data){
        stack.push(c);
       }
       char[] data2=new char[data.length];
       int len=stack.size();
       for(int i=0;i<len;i++){
        data2[i]=stack.pop();
       }
       var reversed=new String(data2);
       return original.equals(reversed);
    }
}