public class Abundant_27 {
    public static void main(String[] args){
        int n=12,sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
            sum=sum+i;
        }
        if(sum>n){
            System.out.println(n+"is an abundant number");
            System.out.println("an abundant number is: "+(sum-n));
        }
        else
        System.out.println(n+"is not abundant");
    }
}
