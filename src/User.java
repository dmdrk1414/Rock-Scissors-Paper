public class User {
    String name;
    Hand hand;

    public User(String name) {
        this.name = name;
    }

    public void resetHandOfUser() {
        hand.setHandRandom();
    }

    @Override
    public String toString() {
        return name;
    }
}
