public class User {
    String name;
    Hand hand;
    int numWin;

    public User(String name) {
        this.name = name;
        hand = new Hand();
        numWin = 0;
    }

    public void resetHandOfUser() {
        hand.setHandRandom();
    }

    public void addNumWin() {
        numWin = numWin + 1;
    }

    public boolean isEndGame() {
        return (this.numWin == 5);
    }

    public String getHand() {
        return hand.getHand();
    }

    public boolean isRightHand(int hand) {
        return this.hand.isRightHand(hand);
    }

    public int getNumWin() {
        return numWin;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
