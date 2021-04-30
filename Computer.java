import java.util.Random;

public class Computer extends SPS {
    Random rand = new Random();

    public int ComputerHand() {
        return rand.nextInt(3);
    }
}
