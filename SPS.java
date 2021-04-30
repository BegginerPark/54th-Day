import java.util.Scanner;

abstract class SPS {
    int hand;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        User us = new User();
        Computer com = new Computer();
        String[] hand = { "바위", "가위", "보" };

        do {
            int userhand = us.UserHand();
            int computerhand = com.ComputerHand();
            System.out.println("나는 " + hand[userhand] + " 이고 당신은 " + hand[computerhand] + " 이다.");
            System.out.println(WinLoss(computerhand, userhand));
            System.out.print("다시 한번?(0) 아니오. (1) 예 : ");
            x = sc.nextInt();
        } while (x == 1);

    }

    public static String WinLoss(int com, int per) {
        if ((com - per == -1) || (com - per == 2))
            return "졌습니다.";
        else if (com - per == 0)
            return "비겼습니다.";
        else
            return "이겼습니다.";
    }
}
