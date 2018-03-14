package Question2;

import java.util.ArrayList;

public class ScoreManager implements Subject {

    private ArrayList<User> users;
    private double currentScoreDisplay;
    private double averageScoreDisplay;

    public ScoreManager() {
        users = new ArrayList<User>();
    }


    @Override
    public void addUser(User user) {
        users.add(user);
//        System.out.println(users);
    }

    @Override
    public void deleteUser(User o) {
        int index = users.indexOf(o);
        System.out.println("Deleted User = " + index);
        users.remove(index);
    }

    @Override
    public void notifyUser() {

        for (User user : users) {

            user.update(currentScoreDisplay, averageScoreDisplay);
            break;
        }
    }

    public void setScore(double currentScoreDisplay, double averageScoreDisplay) {
        this.currentScoreDisplay = currentScoreDisplay;
        this.averageScoreDisplay = averageScoreDisplay;

        notifyUser();
    }


}
