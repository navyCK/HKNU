package com.example.hknu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_layout);

        Button eg2 = (Button)findViewById(R.id.engineer_2);
        Button hak = (Button)findViewById(R.id.student_hall);

        eg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        Engineer2.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });
        hak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        StudentHall.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });
    }

    public void mOnPopupClick2(View v){
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, Popup.class);
        intent.putExtra("data", "업데이트 예정입니다!");
        startActivityForResult(intent, 1);
    }
}
