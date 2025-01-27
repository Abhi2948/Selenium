import java.util.Scanner;
public class Program16 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scan.nextInt();
        int a=0,b=1;
        System.out.print(a+" , "+b+" , ");
        int nextTerm;
        for(int i=2;i<num;i++){
            nextTerm=a+b;
            a=b;
            b=nextTerm;
            System.out.print(nextTerm+" , ");
        }


    }
    
}
