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


    @Override
    public String toString() {
        return name;
    }
}
