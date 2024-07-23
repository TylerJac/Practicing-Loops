import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number less than 11");
        int num = s.nextInt();
        for (int i = 11; i >= num; num++) {
            System.out.println(num);
        }
    }
}
