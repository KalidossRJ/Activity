package lifecycle.com.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Kalidoss on 06/10/16.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("SecondActivity onCreate","onCreate");

        Button btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("SecondActivity onStop","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("SecondActivit onDestroy","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("SecondActivity onPause","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("SecondActivity onResume","onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("SecondActivity onStart"," onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("SecondActivit onRestart","onRestart");
    }
}
