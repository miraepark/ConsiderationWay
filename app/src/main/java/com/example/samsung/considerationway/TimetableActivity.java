package com.example.samsung.considerationway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TimetableActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        //가락시장 글씨 클릭 시 메인화면으로 돌아감
        btn = (Button) findViewById(R.id.garaktext_btn);
        btn.setOnClickListener( // 버튼 이벤트 처리 방법
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(TimetableActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
        );

    }
}
