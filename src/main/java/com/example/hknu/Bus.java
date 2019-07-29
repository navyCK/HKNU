package com.example.hknu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Bus extends Activity {
    Button bus1, bus2;
    ImageView imgbus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus_layout);  // layout xml 과 자바파일을 연결

        bus1 = (Button)findViewById(R.id.btnBus1);
        bus2 = (Button)findViewById(R.id.btnBus2);
        imgbus = (ImageView)findViewById(R.id.imgBus);

        bus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgbus.setImageResource(R.drawable.bus1);
            }
        });
        bus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgbus.setImageResource(R.drawable.bus2);
            }
        });

    } // end onCreate()
}
