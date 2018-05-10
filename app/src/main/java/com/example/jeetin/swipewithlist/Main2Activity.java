package com.example.jeetin.swipewithlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
private String[] table1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
        String[] table1 = {"jeetin", "kumar", "Anand"};
        ListAdapter theadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,table1);
        ListView thelistview = (ListView) findViewById(R.id.listview);
        thelistview.setAdapter(theadapter);
    }
}
