package com.example.samsung.considerationway;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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

        // 파일읽기
        try {
            readTextFile("lostnfound.txt");
        }catch (IOException e) {
            e.printStackTrace();
        }

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
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.icon)
                ," 광운대"
                , "02-917-7445");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.icon)
                ," 구로 "
                , "02-869-0089");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.icon)
                ," 병점"
                , "031-234-7788");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.icon)
                , " 시청"
                , "02-6110-1122");
        mMyAdapter.addItem(
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.icon)
                , " 왕십리"
                , "02-6311-6765");

        mListView.setAdapter(mMyAdapter);

    }

}

