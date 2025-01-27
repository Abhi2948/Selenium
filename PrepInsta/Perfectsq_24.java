public class Perfectsq_24 {
    static boolean isPerfectSquare(int x){
        if(x>=0){
            int sr=(int)Math.sqrt(x);
            return((sr*sr)==x);
        }
        return false;
    }
    public static void main(String args[]){
        int x=49;
        if(isPerfectSquare(x))
        System.out.print("true");
        else
        System.out.print("false");
    }
}
