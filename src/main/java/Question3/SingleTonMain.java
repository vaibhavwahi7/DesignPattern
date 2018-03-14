package Question3;

public class SingleTonMain {
    public static void main(String[] args) {
        SingletonThread singletonThread=SingletonThread.getInstance();
        System.out.println(singletonThread.calculations(15));

        SingletonThread singletonThread1=SingletonThread.getInstance();
        System.out.println(singletonThread1.calculations(12));


        SingletonThread singletonThread2=SingletonThread.getInstance();
        System.out.println(singletonThread1.calculations(2));
    }
}
