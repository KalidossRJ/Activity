package lifecycle.com.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity onCreate","MainActivity onCreate");

        Button btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity onStop","MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity onDestroy","MainActivity onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity onPause","MainActivity onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity onResume","MainActivity onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity onStart","MainActivity onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity onRestart","MainActivity onRestart");
    }
}
