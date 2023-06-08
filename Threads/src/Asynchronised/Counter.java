package Asynchronised;

public class Counter {
    public int counter;

    public Counter(int counter){
        this.counter = counter;
    }

    public synchronized void increment(){
        this.counter++;
    }

    public synchronized void decrement(){
        this.counter--;
    }
}
