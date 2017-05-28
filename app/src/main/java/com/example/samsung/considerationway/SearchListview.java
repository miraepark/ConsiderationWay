package com.example.samsung.considerationway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class SearchListview extends AppCompatActivity implements TextWatcher {

    ListView listView;
    EditText editText;
    ArrayAdapter<String> arrayAdapter;
    //검색리리스트뷰 구현
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_listview);
        listView = (ListView) findViewById(R.id.listView); //리스트뷰 추가
        editText = (EditText) findViewById(R.id.editText);//EditText 추가
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        arrayAdapter.add("가락시장");
        arrayAdapter.add("강동구청");
        arrayAdapter.add("남한산성입구");
        arrayAdapter.add("단대오거리");
        arrayAdapter.add("모란");
        arrayAdapter.add("몽촌토성");
        arrayAdapter.add("문정");
        arrayAdapter.add("복정");
        arrayAdapter.add("산성");
        arrayAdapter.add("석촌");
        arrayAdapter.add("송파");
        arrayAdapter.add("수진");
        arrayAdapter.add("신흥");
        arrayAdapter.add("왕사");
        arrayAdapter.add("잠실");
        arrayAdapter.add("장지");
        arrayAdapter.add("천호");
        listView.setAdapter(arrayAdapter);
        listView.setTextFilterEnabled(true);
        editText.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        listView.setFilterText(editText.getText().toString());
    }

    public void afterTextChanged(Editable s) {
        if (editText.getText().length() == 0) {
            listView.clearTextFilter();
        }
    }

}
