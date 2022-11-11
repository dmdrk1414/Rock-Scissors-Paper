import java.util.Random;

public class Hand {
    final static int rock = 0;
    final static int scissor = 1;
    final static int paper = 2;
    int hand;

    public Hand() {
        setHandRandom();
    }

    public void setHandRandom() {
        int numRandom = getRandNum();
        switch (numRandom) {
            case rock:
                this.hand = rock;
                break;
            case scissor:
                this.hand = scissor;
                break;
            case paper:
                this.hand = paper;
                break;
        }
    }

    private int getRandNum() {
        return new Random().nextInt(3);
    }

    public boolean isRightHand(int hand) {
        return this.hand == hand;
    }

    public String getHand() {
        if (this.hand == rock) {
            return "rock";
        } else if (this.hand == scissor) {
            return "scissor";
        } else {
            return "paper";
        }
    }
}
