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
        if (hand.isRightHand(hand)) {
            return true;
        }
        return true;
    }

    @Override
    public String toString() {
        return name;
    }
}
