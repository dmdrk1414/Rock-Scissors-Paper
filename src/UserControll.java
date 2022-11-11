import java.util.ArrayList;
import java.util.Scanner;

public class UserControll {
    ArrayList<User> userList;
    final static int rock = 0;
    final static int scissor = 1;
    final static int paper = 2;

    public UserControll() {
        this.userList = new ArrayList<>();
    }


    public void creatUser(Scanner sc) {
        for (int i = 0; i < 2; i++) {
            System.out.print((i + 1) + "번의 유저의 이름: ");
            String name = sc.next();
            userList.add(new User(name));
        }
    }

    public void showHandUser() {
        for (User user : this.userList) {
            System.out.println(user.getName() + "의 손가락: " + user.getHand());
        }
    }

    public void whoWin() {
        User firstUser = this.userList.get(0);
        User secondUser = this.userList.get(1);
        int firstUserHand = firstUser.hand.hand;
        int secondUserHand = secondUser.hand.hand;
        isSameHand(firstUserHand, secondUserHand);
        game(firstUser, firstUserHand, secondUserHand);
        game(secondUser, secondUserHand, firstUserHand);
    }

    private static void isSameHand(int firstUserHand, int secondUserHand) {
        if (firstUserHand == secondUserHand) {
            System.out.println("비겼습니다. ");
        }
    }

    private static void game(User firstUser, int firstUserHand, int secondUserHand) {
        if (firstUserHand == rock && secondUserHand == scissor) {
            System.out.println(firstUser + "가 이겼습니다.");
            firstUser.addNumWin();
        } else if (firstUserHand == scissor && secondUserHand == paper) {
            System.out.println(firstUser + "가 이겼습니다.");
            firstUser.addNumWin();
        } else if (firstUserHand == paper && secondUserHand == rock) {
            System.out.println(firstUser + "가 이겼습니다.");
            firstUser.addNumWin();
        }
    }
}
