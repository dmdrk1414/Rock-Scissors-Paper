public class User {
    String name;
    Hand hand;
    int numWin;

    final static int NUM_END_GAME = 5;

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
        return (this.numWin == NUM_END_GAME);
    }

    public String getHand() {
        return hand.getHand();
    }

    public int getNumWin() {
        return numWin;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
