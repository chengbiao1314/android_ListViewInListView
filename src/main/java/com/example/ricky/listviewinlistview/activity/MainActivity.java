package com.example.ricky.listviewinlistview.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ricky.listviewinlistview.R;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionEvent(View v){
        switch (v.getId()){
            case R.id.btn_listview_in_scrollview:
                Intent intent = new Intent(this, ListviewInScrollviewActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
