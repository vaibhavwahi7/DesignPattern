package Question1;

class FreshTomato extends Topping{

    public FreshTomato(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription()+ " Fresh Tomato  ";
    }

    @Override
    public double getcost() {
        return tempPizza.getcost() + 1.5;
    }
}

class Paneer extends Topping{

    public Paneer(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription()+ " Paneer  ";
    }

    @Override
    public double getcost() {
        return tempPizza.getcost() + 6.5;
    }
}

class Jalapeno extends Topping{

    public Jalapeno(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription()+ " Jalapeno  ";
    }

    @Override
    public double getcost() {
        return tempPizza.getcost() + 3.5;
    }
}
