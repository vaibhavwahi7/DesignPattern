package Question2;

public class ApplicationMain {

    public static void main(String[] args) {

        ScoreManager scoreManager = new ScoreManager();

        UserManager userManager = new UserManager(scoreManager);

        scoreManager.setScore(123,15);
        System.out.println();
        UserManager userManager1 = new UserManager(scoreManager);

        scoreManager.setScore(153,26);


    }
}
