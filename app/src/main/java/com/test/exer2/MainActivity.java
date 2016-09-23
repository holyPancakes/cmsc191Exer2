package com.test.exer2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void randomize(View view){
        ListView kainan = (ListView)findViewById(R.id.listView);
        int numOfKainan = getResources().getStringArray(R.array.list_values).length;
        int rand = new Random().nextInt(numOfKainan);
        kainan.smoothScrollToPosition(rand-1);
    }
}
