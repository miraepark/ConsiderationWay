package com.example.samsung.considerationway;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;

public class Call extends AppCompatActivity {

    private ListView mListView;
    MyAdapter mMyAdapter = new MyAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        // 위젯과 멤버변수 참조 획득
        mListView = (ListView)findViewById(R.id.listView);

        //리스트뷰나타내기
        dataSetting();

    }

    //파일읽기
    public void readTextFile(String fileName) throws IOException {
        try {
            java.io.InputStream is = getAssets().open(fileName);
            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(is));
            String oneLine = "";
            while ((oneLine = br.readLine()) != null) {
                //함수널예정
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //리스트뷰나타내기
    private void dataSetting(){
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.l1)
                ," 광운대역"
                , "02-917-7445");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.l1)
                ," 구로역 "
                , "02-869-0089");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.l1)
                ," 병점역"
                , "031-234-7788");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.l12)
                , " 시청역"
                , "02-6110-1122");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.l258)
                , " 왕십리역"
                , "02-6311-6765");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.l3)
                , " 대곡역"
                , "031-965-8516");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.l34)
                , " 충무로역"
                , "02-6110-3344");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.l4)
                , " 안산역"
                , "031-491-7788");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.l67)
                , " 태릉입구역"
                , "02-6311-6766");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.l9)
                , " 동작역"
                , "02-2656-0009");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.l9air)
                , " 김포공항역"
                , "032-745-7777");

        mListView.setAdapter(mMyAdapter);

    }

}

