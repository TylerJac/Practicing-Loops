import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Give a number: ");
        int num = s.nextInt();
        while (num != 5) {
            System.out.print("Give a number: ");
            num = s.nextInt();
        }
    }
}
