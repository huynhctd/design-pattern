package observer;

import java.util.function.IntConsumer;

public class MultiThreadExample {

    public static class Calculator {
        public int sum(int a, int b) {
            return  a + b;
        }
    }

    public static void main(String[] args) {
        // Using consumer like a interface observer
        final Calculator calculator =  new Calculator();
        final IntConsumer callBack = result ->
            System.out.println("Result : " + result);


        final Thread newThread =  new Thread(() -> {
            final int sumResult = calculator.sum(1, 2);
            callBack.accept(sumResult);
        });

        newThread.start();

    }
}
