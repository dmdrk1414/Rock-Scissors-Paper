import java.util.Scanner;

public class ProgressGame {
    UserControll controll;
    Scanner sc;

    public ProgressGame() {
        this.controll = new UserControll();
        this.sc = new Scanner(System.in);
    }

    public void run() {
        controll.creatUser(sc);
        System.out.println();

        boolean isEndGame = true;
        while (isEndGame) {
            controll.showHandUser();
            controll.whoWin();
            isEndGame = !controll.isEndGame();
            System.out.println();
            controll.resetHandOfUser();
        }

        controll.showResoltGameScore();
    }
}
