package Question1;

abstract class Topping implements Pizza {
    Pizza tempPizza;

    public Topping(Pizza pizza) {
        tempPizza = pizza;
    }
}
