import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.printf("%d x %d = %d%n", num, i, product);
        }
    }
}
