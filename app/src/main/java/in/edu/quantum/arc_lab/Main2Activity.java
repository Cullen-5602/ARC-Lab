package in.edu.quantum.arc_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    String msg ="Android: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(msg, "The onCreate() event.");
    }

    public void onClick(View view){
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }

    public void onClickROS(View view){
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }

    public void onClickRapid(View view){
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }

    public void onClickAdv(View view){
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }

    public void onClickCpp(View view){
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }

    public void onClickArc(View view){
        Intent i = new Intent (this, qarcActivity.class);
        startActivity(i);
    }

    public void onClickPda(View view){
        Intent i = new Intent (this, PdaActivity.class);
        startActivity(i);
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
        Log.d(msg, "The onDestroy() event.");
    }
}
