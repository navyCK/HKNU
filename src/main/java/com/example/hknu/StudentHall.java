package com.example.hknu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StudentHall extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hak_layout);

        Button btn6 = (Button)findViewById(R.id.hak_btn6);
        Button btn7 = (Button)findViewById(R.id.hak_btn7);
        Button btn8 = (Button)findViewById(R.id.hak_btn8);
        Button btn9 = (Button)findViewById(R.id.hak_btn9);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tMsg = Toast.makeText(StudentHall.this, "2층에 있습니다!",
                        Toast.LENGTH_SHORT);
                tMsg.show();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tMsg = Toast.makeText(StudentHall.this, "2층에 있습니다!",
                        Toast.LENGTH_SHORT);
                tMsg.show();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tMsg = Toast.makeText(StudentHall.this, "중앙 현관 화장실 앞에 있습니다!",
                        Toast.LENGTH_SHORT);
                tMsg.show();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tMsg = Toast.makeText(StudentHall.this, "1층 현관에 있습니다!",
                        Toast.LENGTH_SHORT);
                tMsg.show();
            }
        });
    }

    public void mOnPopupClick5(View v){
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, Popup.class);
        intent.putExtra("data", "대학 일자리 센터 : 031-670-5076               1층에 있습니다!");
        startActivityForResult(intent, 1);
    }
    public void mOnPopupClick6(View v){
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, Popup.class);
        intent.putExtra("data", "학생과 : 031-670-5052                             1층에 있습니다!");
        startActivityForResult(intent, 1);
    }
    public void mOnPopupClick7(View v){
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, Popup.class);
        intent.putExtra("data", "보건소 : 031-670-5119                             1층에 있습니다!");
        startActivityForResult(intent, 1);
    }
    public void mOnPopupClick8(View v){
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, Popup.class);
        intent.putExtra("data", "서점 : 031-675-2952                               1층에 있습니다!");
        startActivityForResult(intent, 1);
    }


}
