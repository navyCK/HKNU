package com.example.hknu;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.Layout;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.CompoundButton;
        import android.widget.ImageView;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.RelativeLayout;
        import android.widget.TextView;
        import android.widget.Toast;

public class Engineer2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eg2_layout);

        Button btn2 = (Button)findViewById(R.id.eg2_btn2);
        Button btn3 = (Button)findViewById(R.id.eg2_btn3);
        Button btn4 = (Button)findViewById(R.id.eg2_btn4);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tMsg = Toast.makeText(Engineer2.this, "1층 중앙 현관에 위치해있습니다!",
                        Toast.LENGTH_SHORT);
                tMsg.show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tMsg = Toast.makeText(Engineer2.this, "1층 중앙 현관에 위치해있습니다!",
                        Toast.LENGTH_SHORT);
                tMsg.show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tMsg = Toast.makeText(Engineer2.this, "각 층 화장실 첫 번째 칸에 있습니다!",
                        Toast.LENGTH_SHORT);
                tMsg.show();
            }
        });
    }

    public void mOnPopupClick4(View v){
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, Popup.class);
        intent.putExtra("data", "환경공학과 : 031-670-5170                     컴퓨터공학과(SC) : 031-670-5350                    식품생명공학과 : 031-670-5150");
        startActivityForResult(intent, 1);
    }


}
