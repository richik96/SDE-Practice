package Threading;

public class ThreadWithSync {

    public static void main(String[] args) {

        ThreadWithSync counter = new ThreadWithSync();

        Thread t1 = new Thread(() -> {
            for(int i=0; i<100; i++) {
                counter.counter();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<10; i++) {
                counter.counter();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Final Count --> "+counter.getCount());
    }
    int count = 0;
    public void counter() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
