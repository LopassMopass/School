package Asynchronised;

public class ThreadCounter implements Runnable{
    public Counter c;

    public ThreadCounter(Counter c){
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++){
            c.increment();
        }
    }
}
