public class Program17 {
    static int a=0,b=1,nextTerm;
    public static void main(String args[]){
        int n=15;
        System.out.print(a+" , "+b+" , ");
        Fib(n-2);
    }
    static int Fib(int n){
        if(n>0){
            nextTerm=a+b;
            a=b;
            b=nextTerm;
            System.out.print(nextTerm+" , ");
            Fib(n-1);
        }
        return 0;
    }
    
}
