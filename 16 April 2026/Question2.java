import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum1 += i;
            }
        }
        for (int i = 1; i < b; i++) {
            if (b % i == 0) {
                sum2 += i;
            }
        }
        if (sum1 * b == sum2 * a) {
            System.out.println("Yes, they are a Friendly Pair");
        } else {
            System.out.println("No, they are NOT a Friendly Pair");
        }

        sc.close();
    }
}