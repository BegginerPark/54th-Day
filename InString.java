import java.util.*;

public class InString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("S1 : ");
        String S1 = sc.next();
        System.out.print("S2 : ");
        String S2 = sc.next();

        int idx = S1.indexOf(S2);
        if (idx == -1) {
            System.out.println("S1안에 S2가 포함되어 있지 않습니다.");
        } else {
            System.out.println(S1);
            for (int i = 0; i < idx; i++) {
                System.out.print(" ");
            }

            System.out.println(S2);

        }
    }
}
