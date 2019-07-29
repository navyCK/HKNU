package com.example.hknu;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        help = (TextView)findViewById(R.id.btnHelp);
        Button bus = (Button)findViewById(R.id.btnBus);
        Button hak = (Button)findViewById(R.id.haksa);
        Button map = (Button)findViewById(R.id.btnMap);
        Button menu = (Button)findViewById(R.id.meal_menu);

        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        Bus.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        Map.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });

        hak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hknu.ac.kr/web/kor/l_01_01"));
                startActivity(intent);
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hknu.ac.kr/web/kor/l_05_06_01"));
                startActivity(intent);
            }
        });
    }

    public void mOnPopupClick(View v){
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, Popup.class);
        intent.putExtra("data", "지도에서 좌우로 드래그 하여 이동하고, 건물의 정보를 확인하려면 건물 번호를  터치하세요!");
        startActivityForResult(intent, 1);
    }

    public void mOnPopupClick1(View v){
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, Popup.class);
        intent.putExtra("data", "애플리케이션 문의 \n\nKJH : rlawhdgur94@naver.com \nKTY : 5jeeeeek@naver.com \nJCK : ck2711@naver.com");
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                //데이터 받기
                String result = data.getStringExtra("result");
                help.setText(result);
            }
        }
    }
}
