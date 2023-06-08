package Thread;

public class IncrementThread extends Thread{
    private MyNumber number;

    public IncrementThread(MyNumber number){
        this.number = number;
    }

    public void run(){
        for (int i = 0; i < 100; i++){
            number.increase();
        }
    }
}
