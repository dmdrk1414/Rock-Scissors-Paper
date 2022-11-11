import java.util.Random;

public class Hand {
    final static int rock = 0;
    final static int scissor = 1;
    final static int paper = 2;
    String hand;

    public Hand() {
        hand = "";
    }

    public void setHandRandom() {
        int numRandom = getRandNum();
        switch (numRandom) {
            case rock:
                this.hand = "rock";
                break;
            case scissor:
                this.hand = "scissor";
                break;
            case paper:
                this.hand = "paper";
                break;
        }
    }

    public int getRandNum() {
        return new Random().nextInt(3);
    }

    public static void main(String[] args) {
        Hand hand = new Hand();
        hand.setHandRandom();
    }
}
