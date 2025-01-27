// import java.util.Scanner;

// public class Program15 {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter  lowerand upper reanges : ");
//         int low=sc.nextInt();
//         int high=sc.nextInt();
//         System.out.println("armstrong number between "+low+" and "+high+" are : ");
//         for(int num=low;num<=high;num++){
//             int sum=0,temp,digit,len;
//             len=getOrder(num);
//             temp=num;
//             while(temp!=0){
//                 digit=temp%10;
//                 sum=sum+(int)Math.pow(digit,len);
//                 temp/=10;
//             };
//             if(sum==num)
//             System.out.print(num+" ");

//         }
//     }    
//     private static int getOrder(int num){
//         int len=0;
//         while(num!=0){
//             len++;
//             num=num/10;
//         }
//         return len;
//     }
// }
import java.util.Scanner;

public class Program15 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter  lowerand upper reanges : ");
        int low=sc.nextInt();
        int high=sc.nextInt();
        System.out.println("armstrong number between "+low+" and "+high+" are : ");
        for(int num=low;num<=high;num++){
        int len=getOrder(num);
        if(num==getArmstrongSum(num,len))
        System.out.print(num+" ");
        }
    }
    private static int getOrder(int num){
        int len=0;
        while(num!=0){
            len++;
            num=num/10;
        }
        return len;
    }
    private static int getArmstrongSum(int num,int order){
        if(num==0)
        return 0;
        int digit=num%10;
        return (int) Math.pow(digit,order)+getArmstrongSum(num/10, order);
    }
}