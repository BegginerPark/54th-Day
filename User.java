import java.util.Scanner;

public class User extends SPS {
    Scanner sc = new Scanner(System.in);

    public int UserHand() {
        do {
            System.out.print("가위바위보!!0..바위/1..가위/2..보 ");
            hand = sc.nextInt();
        } while (hand < 0 || hand > 2);
        return hand;
    }
}