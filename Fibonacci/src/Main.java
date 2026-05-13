import java.util.Scanner;
public class Main {

    public static int fibonacci(int n){
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Fibonacci of " + i + " is " + fibonacci(i));
            System.out.println();
        }
        scanner.close();
    }
}
