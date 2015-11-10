package com.example.minyoung.bt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.Menu;

/**
 * Created by Minyoung on 2015-11-08.
 */
public class StartActivity extends Activity {

    Button b10,b11,b12,b13,b14;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_page);

        b10 = (Button) findViewById(R.id.button10);
        b11=(Button)findViewById(R.id.button11);
        b12=(Button)findViewById(R.id.button12);
        b13=(Button)findViewById(R.id.button13);
        b14=(Button)findViewById(R.id.button14);

    }

    public void go_config(View v){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);

        setContentView(R.layout.start_page);
    }

    public void go_about(View v){
        Intent f = new Intent(getApplicationContext(), AboutActivity.class);
        startActivity(f);

        setContentView(R.layout.start_page);
    }

    public void go_recieve(View v){
        Intent f = new Intent(getApplicationContext(), BluetoothTest.class);
        startActivity(f);

        setContentView(R.layout.start_page);
    }
}
