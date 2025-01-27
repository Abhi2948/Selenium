// import java.util.Scanner;
// public class Program8 {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("the year is : ");
//         int year=sc.nextInt();
//         if(year%400==0)
//         System.out.print(year+" is leap year");
//         else if(year%4==0 && year%100!=0)
//         System.out.print(year+" is leap year");
//         else
//         System.out.print(year+" is not leap year");
//     }
    
// }
import java.util.Scanner;
public class Program8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("the year is : ");
        int year=sc.nextInt();
        int flag=(year%400==0)||(year%4==0 && year%100!=0)?1:0;
        if(flag==1)
        {
            System.out.print(year+"is leap year");
        }
        else{
            System.out.print(year+"is not leap year");
        }
    }
    
}
