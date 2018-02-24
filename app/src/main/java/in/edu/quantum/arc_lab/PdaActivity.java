package in.edu.quantum.arc_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class PdaActivity extends AppCompatActivity {

    String msg ="Android: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pda);
        Log.d(msg, "The onCreat() event of development section.");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(msg, "The onStart() event of development section.");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg, "The onResume() event of development section.");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg, "The onPause() event of development section.");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(msg, "The onStop() event of development section.");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(msg, "The onDestroy() event of development section.");
    }

}
