import java.util.Scanner;

public class Main {
    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Factorial of " + i + " is " + factorial(i));
            System.out.println();
        }
        scanner.close();
    }
}
