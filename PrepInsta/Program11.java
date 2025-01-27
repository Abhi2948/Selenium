// public class Program11 {
//     public static void main(String args[]){
//         int num=12345,sum=0;
//         while(num!=0){

// /**Iteration Steps:

// Iteration	num	    num % 10(Last Digit)	sum (Updated)	    num / 10 (Reduced)
// 1	        12345	5	                     0 + 5 = 5	         1234
// 2	        1234	4	                     5 + 4 = 9	         123
// 3	        123	    3	                     9 + 3 = 12	         12
// 4	        12	    2	                     12 + 2 = 14	     1
// 5	        1	    1	                     14 + 1 = 15	     0                              */
            

//             sum+=num%10;//Last digit
//             num=num/10;//reduce
//         }
//         System.out.println(sum);
//     }
    
// }

// public class Program11 {
// public static void main(String args[]){
//     int num=12345;
//     System.out.println("Sum of digit"+getSum(num));
// }
// static int getSum(int num){
//     if(num==0)
//     return 0;
//     return (num%10)+getSum(num/10);
// }
// }

public class Program11 {
    public static void main(String args[]){
        String num="98765432187654321";
        System.out.println("Sum of digit"+getSum(num));

    }
    static int getSum(String num){
int sum=0;
for(int i=0;i<num.length();i++){
    sum=sum+num.charAt(i)-48;
    /**Input: A string num representing a number.
sum = sum + num.charAt(i) - 48:
num.charAt(i) extracts the character at position i.
num.charAt(i) - 48 converts the character to its corresponding integer value (ASCII value of '0' is 48).
This is done for each character in the string.
The loop iterates through each character of the string num, adding the integer value of each digit to sum.
The final sum is returned */
}
return sum;
    }
}