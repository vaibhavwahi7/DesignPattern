package Question1;

public class Margherita implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita";
    }

    @Override
    public double getcost() {
        return 23.5;
    }
}
