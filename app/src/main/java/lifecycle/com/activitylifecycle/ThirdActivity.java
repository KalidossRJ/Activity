package lifecycle.com.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Kalidoss on 06/10/16.
 */
public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ThirdActivity onCreate","onCreate");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ThirdActivity onStop","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ThirdActivity onDestroy","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ThirdActivity onPause","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ThirdActivity onResume","onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ThirdActivity onStart"," onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ThirdActivity onRestart","onRestart");
    }
}