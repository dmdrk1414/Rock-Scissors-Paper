public class User {
    String name;
    Hand hand;

    public User(String name) {
        this.name = name;
    }

    public void resetHandOfUser() {
        hand.setHandRandom();
    }

    public boolean isRightHand(String hand) {
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
