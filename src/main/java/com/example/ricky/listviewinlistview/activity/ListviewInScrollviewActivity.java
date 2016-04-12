package com.example.ricky.listviewinlistview.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ricky.listviewinlistview.R;
import com.example.ricky.listviewinlistview.utils.AdapterUtility;

/**
 * Created by admin on 2016/4/12.
 */
public class ListviewInScrollviewActivity extends Activity {
    private mAdapter madapter;
    private ListView lv_listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_in_scrollview);

        lv_listview = (ListView) findViewById(R.id.lv_listview);

        initListView();
    }

    private void initListView(){
        if(madapter == null){
            madapter = new mAdapter();
        }
        lv_listview.setAdapter(madapter);
        AdapterUtility.setListViewHeightBasedOnChildren(lv_listview);
    }

   public  class mAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 30;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView tv;
            if (convertView == null) {
                convertView = View.inflate(ListviewInScrollviewActivity.this, R.layout.item_lv_listview_in_scrollview, null);
            }
            tv = (TextView) convertView.findViewById(R.id.tv_item);
            tv.setText("item"+position);
            return convertView;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }
        @Override
        public long getItemId(int position) {
            return position;
        }


    }
}
