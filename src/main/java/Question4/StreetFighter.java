package Question4;

public class StreetFighter {

    String kick;

    public Roll roll;

    public String getRoll() {
        return roll.rollType();
    }

    public void setRoll(Roll roll) {
        this.roll = roll;
    }

    public String getJump() {
        return jump.jumpType();
    }

    public void setJump(Jump jump) {
        this.jump = jump;
    }

    public Jump jump;

    public String getKick() {
        return kick;
    }

    public void setKick(String kick) {
        this.kick = kick;
    }

    public String getPunch() {
        return punch;
    }

    public void setPunch(String punch) {
        this.punch = punch;
    }

    String punch;
}
