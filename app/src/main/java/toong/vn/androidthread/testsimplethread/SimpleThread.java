package toong.vn.androidthread.testsimplethread;

import android.util.Log;

/**
 * Java threads are one-time use only and die after executing its run method
 */
public class SimpleThread extends Thread {
    @Override
    public void run() {
        super.run();
        // Execute task that take many times

        Log.i(Thread.currentThread().getName(), "run");
        for (int i = 0; i < 100000; i++) {
            if (i % 10000 == 0) {
                Log.i(Thread.currentThread().getName(), "" + i);
            }
        }
        Log.i(Thread.currentThread().getName(), "end");
    }
}
