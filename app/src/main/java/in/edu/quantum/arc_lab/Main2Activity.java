package in.edu.quantum.arc_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    String msg ="Android: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(msg. "The onCreate() event.");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(msg, "The onStart() event.");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg, "The onResume() event.");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg, "The onPause() event.");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(msg, "The onStop() event.");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(msg, "The onDestroy() event.")
    }
}
