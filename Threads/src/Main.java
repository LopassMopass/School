import Thread.*;
import Asynchronised.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*try {
            for(int i = 0; i < 10; i++){
                System.out.println(" * ");
                Thread.sleep(500);
            }
        }catch (Exception e){
        }*/
        /*Thread thread = new Thread(new MyRunnable());

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char string = 'a'; string <= 'z'; string++){
                    System.out.print(string+" ");
                }
            }
        });

        thread.start();
        thread1.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nEnd");*/
        /*MyNumber numbers = new MyNumber();
        IncrementThread thread = new IncrementThread(numbers);
        thread.start();
        System.out.println(numbers.getNumber());*/

        /*Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            int number = random.nextInt(101);
            arrayList.add(number);
        }
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i : arrayList) {
                    System.out.print(i+" ");
                    if (i < max){
                        i = max;
                    }else {
                        
                    }
                }
            }
        });
        thread.start();*/

        Counter c = new Counter(0);

        Thread t1 = new Thread(new ThreadCounter(c));
        Thread t2 = new Thread(new ThreadCounter(c));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            System.out.println(c.counter);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}