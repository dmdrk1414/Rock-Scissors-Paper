import java.util.Random;

public class Hand {


    public void getRandNum() {
        int random = new Random().nextInt(3);
        System.out.println(random);
    }

    public static void main(String[] args) {
        Hand hand = new Hand();
        hand.getRandNum();
    }
}
