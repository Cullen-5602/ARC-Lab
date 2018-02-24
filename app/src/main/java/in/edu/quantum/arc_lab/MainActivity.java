package in.edu.quantum.arc_lab;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String msg ="Android: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreat() event of reference section.");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(msg, "The onStart() event of reference section.");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg, "The onResume() event of reference section.");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg, "The onPause() event of reference section.");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(msg, "The onStop() event of reference section.");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(msg, "The onDestroy() event of reference section.");
    }


    public void openBrowser(View view)
    {
        String url=(String)view.getTag();
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
