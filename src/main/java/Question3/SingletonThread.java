package Question3;

public class SingletonThread {
    private static SingletonThread singletonThread = null;

    double num = 1;

    private SingletonThread() {

    }

    public double calculations(double num) {
        this.num=this.num * num;
        return this.num;
    }

    public static SingletonThread getInstance() {
        if (singletonThread == null) {
            singletonThread = new SingletonThread();
        }
        return singletonThread;
    }
}
