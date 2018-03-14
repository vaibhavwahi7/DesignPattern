package Question1;

public class DecoratorMain {
    public static void main(String[] args) {
        Pizza myPizza=new FreshTomato(new Paneer(new ChickenFiesta()));
        System.out.println(myPizza.getDescription());
        System.out.println(myPizza.getcost());
    }
}
