package toong.vn.androidthread.testmultilplethread;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import toong.vn.androidthread.R;

public class MultipleThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_thread);

        testMultipleThread();
    }

    private void testMultipleThread() {
        Thread1 R1 = new Thread1("Thread-1");
        R1.start();

        Thread1 R2 = new Thread1("Thread-2");
        R2.start();
    }
}
