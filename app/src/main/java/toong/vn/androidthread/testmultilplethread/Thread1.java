package toong.vn.androidthread.testmultilplethread;

import android.util.Log;

class Thread1 implements Runnable {
    private String TAG = getClass().getSimpleName();
    private Thread t;
    private String threadName;

    Thread1(String name) {
        threadName = name;
        Log.i(TAG, "Creating " + threadName);
    }

    public void run() {
        Log.i(TAG, "Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                Log.i(TAG, "Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            Log.i(TAG, "Thread " + threadName + " interrupted.");
        }
        Log.i(TAG, "Thread " + threadName + " exiting.");
    }

    public void start() {
        Log.i(TAG, "Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
