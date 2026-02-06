import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        
        int less = Math.min(a, b);
        int more = Math.max(a, b);
        int sum = 0;

        for (int i = less; i <= more; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum: " + sum);

        input.close();
    }
}
