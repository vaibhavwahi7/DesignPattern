package Question2;

public class UserManager implements User {
    private double currentScoreDisplay;
    private double averageScoreDisplay;
    private Subject scoreManager;

    public UserManager(Subject scoremanager) {
        this.scoreManager = scoremanager;
        scoreManager.addUser(this);
    }


    @Override
    public void update(double currentScoreDisplay, double averageScoreDisplay) {
        this.currentScoreDisplay = currentScoreDisplay;
        this.averageScoreDisplay = averageScoreDisplay;
        printPrices();
    }

    private void printPrices() {
        System.out.println("Current Score Display = " + currentScoreDisplay);
        System.out.println("Average Score Display = " + averageScoreDisplay);
    }

}
