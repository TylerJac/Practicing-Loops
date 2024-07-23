import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        while (true) {
            if (num >0) {
                System.out.println(num);
                System.out.print("Enter a number: ");
                num = s.nextInt();
        } else if (num < 0) {
            System.out.println("Negative numbers are not allowed.");
            System.out.print("Enter a positive number: ");
            num = s.nextInt();
         } else {
                break;
            }
        }
    }
}
