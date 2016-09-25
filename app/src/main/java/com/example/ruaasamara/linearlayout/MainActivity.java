package com.example.ruaasamara.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button start, pause, relativeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeButton = (Button) findViewById(R.id.relativeButtonOne);
        start = (Button) findViewById(R.id.btnStart);
        pause =  (Button) findViewById(R.id.btnPause);
        start.setOnClickListener(myhandler1);
        pause.setOnClickListener(myhandler2);



    }

    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {
            start.setText("We have started the operation");
            pause.setText("Pause");
            relativeButton.setText("START OPERATION");

            pause.setBackgroundColor(0xFFFC6262);
            Toast.makeText(MainActivity.this, "YOUR HAVE CLICKED THE START OPERATION BUTTON and here we go", Toast.LENGTH_LONG).show();
            v.setBackgroundColor(0x1200FF00);
            RelativeLayout relative = (RelativeLayout) findViewById(R.id.relativeLayout);
            relative.setBackgroundColor(0xFF300F00);

        }
    };
    View.OnClickListener myhandler2 = new View.OnClickListener() {
        public void onClick(View v) {
            pause.setText("We have Puased the operation");
            start.setText("Start");
            relativeButton.setText("Pause OPERATION");

            start.setBackgroundColor(0xFFFC6262);
            Toast.makeText(MainActivity.this, "YOUR HAVE CLICKED THE PAUSE OPERATION BUTTON ", Toast.LENGTH_LONG).show();
            v.setBackgroundColor(0x1200F856);
            RelativeLayout relative = (RelativeLayout) findViewById(R.id.relativeLayout);
            relative.setBackgroundColor(0xFF777777);

        }
    };






}
