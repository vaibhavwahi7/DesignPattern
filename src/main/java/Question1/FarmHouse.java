package Question1;

import Question1.Pizza;

public class FarmHouse implements Pizza {
    @Override
    public String getDescription() {
        return "Farm House";
    }

    @Override
    public double getcost() {
        return 13.0;
    }
}