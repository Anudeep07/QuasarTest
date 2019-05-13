package testgrp;

import java.util.concurrent.ExecutionException;

import co.paralleluniverse.strands.SuspendableCallable;
import co.paralleluniverse.strands.SuspendableRunnable;
import co.paralleluniverse.strands.channels.Channels;
import co.paralleluniverse.strands.channels.IntChannel;

import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.SuspendExecution;

/**
 * Increasing-Echo Quasar Example
 *
 * @author circlespainter
 */
public class QuasarIncreasingEchoApp {

    static public void main(String[] args) throws ExecutionException, InterruptedException {

        for(int i=0 ; i<20 ; i++) {
            int finalI = i;
            new Fiber<Void>(new SuspendableRunnable() {
                public void run() throws SuspendExecution, InterruptedException {
                    // your code
                    System.out.println(finalI);
                }
            }).start();
        }

    }
}