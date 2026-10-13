package org.example.jdk;

import java.util.concurrent.*;

public class GameRoomDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4,()->{
            System.out.println("准备完成，即将开始");
        });

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i=0;i<4;i++) {
            final int playerId = i;
            executorService.execute(()->{

                System.out.println("player " +playerId +" is ready");
                try {
                    cyclicBarrier.await();
                    System.out.println("人齐了，开始战斗");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}
