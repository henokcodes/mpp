package Threads;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) throws InterruptedException {
        PrimeChecker object1 = new PrimeChecker(1,100000);
        PrimeChecker object2 = new PrimeChecker(100001,200000);
        PrimeChecker object3 = new PrimeChecker(200001,300000);
        PrimeChecker object4 = new PrimeChecker(300001,400000);
        PrimeChecker object5 = new PrimeChecker(400001,500000);
        PrimeChecker object6 = new PrimeChecker(500001,600000);
        PrimeChecker object7 = new PrimeChecker(600001,700000);
        PrimeChecker object8 = new PrimeChecker(700001,800000);
        PrimeChecker object9 = new PrimeChecker(800001,900000);
        PrimeChecker object10 = new PrimeChecker(900001,1000000);

        List<Thread> threads = new ArrayList<>();
        threads.add(new Thread(object1));
        threads.add(new Thread(object2));
        threads.add(new Thread(object3));
        threads.add(new Thread(object4));
        threads.add(new Thread(object5));
        threads.add(new Thread(object6));
        threads.add(new Thread(object7));
        threads.add(new Thread(object8));
        threads.add(new Thread(object9));
        threads.add(new Thread(object10));


        for (Thread thread: threads
             ) {
            thread.start();
//            thread.join();
        }
        PrimeChecker.print();



    }
}
