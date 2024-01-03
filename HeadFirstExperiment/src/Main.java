import chapter17_network.ConnectionToNetwork;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main<T> {

    public static void main(String[] args) throws IOException {



    }

    public static void waitForLatchThenPrint(CountDownLatch latch) {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("print sth");
    }
}