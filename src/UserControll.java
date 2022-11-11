import java.util.ArrayList;
import java.util.Scanner;

public class UserControll {
    ArrayList<User> userList;

    public UserControll() {
        this.userList = new ArrayList<>();
    }


    public void creatUser(User user, Scanner sc) {
        for (int i = 0; i < 2; i++) {
            System.out.print((i + 1) + "번의 유저의 이름: ");
            String name = sc.next();
            userList.add(new User(name));
        }
    }

    public void showHandUser() {
        for (User user : this.userList) {
            System.out.println(user.getName() + "의 손가락: " + user);
        }
    }

    public void whoWin() {
        User firstUser = this.userList.get(0);
        User secondUser = this.userList.get(1);
        int firstUserHand = firstUser.hand.hand;
        int secondUserHand = firstUser.hand.hand;

        if (firstUserHand == secondUserHand) {
            System.out.println("비겼습니다. ");
        } else {

        }
    }
}
