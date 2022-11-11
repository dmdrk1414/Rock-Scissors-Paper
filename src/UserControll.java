import java.util.ArrayList;
import java.util.Scanner;

public class UserControll {
    ArrayList<User> userList;
    int numUser;

    public UserControll() {
        this.userList = new ArrayList<>();
        numUser = 0;
    }

    public void inputNumOfUser(Scanner sc) {
        System.out.print("유저의 숫자는 몇명이야?");
        numUser = sc.nextInt();
    }

    public void creatUser(User user, Scanner sc) {
        for (int i = 0; i < numUser; i++) {
            System.out.print((i + 1) + "번의 유저의 이름: ");
            String name = sc.next();
            userList.add(new User(name));
        }
    }


}
