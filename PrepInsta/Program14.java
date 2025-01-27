// public class Program14{
//     public static void main(String args[]){
//         int num=407,len;
//         len=order(num);
//         if(armstrong(num,len))
//         System.out.println(num+"is armstrong");
//         else
//         System.out.println(num+"is not armstrong");
//     }
//     static int order(int x){
//         int len=0;
//         while(x!=0)
//         {
//             len++;
//             x=x/10;
//         }
//         return len;
//     }
//     static boolean armstrong(int num,int len){
//         int sum=0,temp,digit;
//         temp=num;
//         while(temp!=0){
//             digit=temp%10;
//             sum=sum+(int)Math.pow(digit,len);
//             temp/=10;
//         };
//         return num==sum;
//     }
// }
import java.util.*;
import java.lang.*;
class Program14{
    public static void main(String[] args){
        int num=1634,reverse=0;
        int len=order(num);
        if(num==getArmstrongSum(num,len))
        System.out.println(num+"is armstrong");
        else
        System.out.println(num+"is not armstrong");
    }
    private static int getArmstrongSum(int num,int order){
        if(num==0)
        return 0;
        int digit=num%10;
        return(int) Math.pow(digit,order)+getArmstrongSum(num/10, order);

    }
    private static int order(int num){
        int len=0;
        while(num!=0){
            len++;
            num=num/10;
        }
        return len;
    }
}