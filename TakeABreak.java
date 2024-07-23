import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to take a break?");
        String answer = s.nextLine();
        while(!answer.equals("yes")) {
            System.out.println("Do you want to take a break?");
            answer = s.nextLine();
        }
    }
}
