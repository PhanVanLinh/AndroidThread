package toong.vn.androidthread.democreatethread;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import toong.vn.androidthread.R;

/**
 * There are 2 ways to create thread <br/>
 * 1) extends Thread <br/>
 * 2) implements Runnable  <br/>
 *
 * There are 2 ways for creating Thread because Java don't support multiple inheritance
 */
public class CreateThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_thread);
    }

    private void firstWayCreateThread() {
        PrimeThread p = new PrimeThread(143);
        p.start();
    }

    private void secondWayCreateThread() {
        PrimeRun p = new PrimeRun(143);
        new Thread(p).start();
    }
}
