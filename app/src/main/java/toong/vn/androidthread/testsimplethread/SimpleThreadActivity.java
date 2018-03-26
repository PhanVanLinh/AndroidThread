package toong.vn.androidthread.testsimplethread;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import toong.vn.androidthread.R;

public class SimpleThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_thread);

        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start();
    }
}
