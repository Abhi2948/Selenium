// import java.util.*;
import java.util.Scanner;
public class Program3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int sum=getSum(num);
        System.out.println("the  numbers are : "+sum);
    }
    static int getSum(int num)
    {
        if(num==0)
        return num;
        return num+getSum(num-1);
    }
    
}
