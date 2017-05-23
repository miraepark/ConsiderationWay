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

        for(int i=0;i<9;i++) {
            mMyAdapter.addItem(
                    ContextCompat.getDrawable(getApplicationContext(), R.drawable.icon)
                    , "name_"+i
                    , "test"+i);
        }

        mListView.setAdapter(mMyAdapter);

    }

}

