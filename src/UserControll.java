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
        numUser = sc.nextInt();
    }

}
