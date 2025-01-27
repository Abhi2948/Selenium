public class Harshad_26 {
    public static void main(String[] args) {
        int n = 345; // Original number
        int temp = n; // Preserve the original number
        int result = 0;

        // Calculate the sum of digits
        while (temp != 0) {
            int pick_last = temp % 10;
            result = result + pick_last;
            temp = temp / 10;
        }

        // Check if the number is a Harshad number
        if (n % result == 0)
            System.out.println(n + " is a Harshad Number");
        else
            System.out.println(n + " is not a Harshad Number");
    }
}
