public class User {
    String name;
    Hand hand;
    int numWin;

    public User(String name) {
        this.name = name;
        numWin = 0;
    }

    public void resetHandOfUser() {
        hand.setHandRandom();
    }

    public void addNumWin() {
        numWin = numWin + 1;
    }

    public boolean isRightHand(int hand) {
        return this.hand.isRightHand(hand);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
