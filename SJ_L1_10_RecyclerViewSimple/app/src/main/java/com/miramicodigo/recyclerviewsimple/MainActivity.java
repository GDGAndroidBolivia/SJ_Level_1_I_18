package com.miramicodigo.recyclerviewsimple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout llListView;
    private LinearLayout llRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llListView = (LinearLayout) findViewById(R.id.llListView);
        llRecyclerView = (LinearLayout) findViewById(R.id.llRecyclerView);

        llListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DataListViewActivity.class));
            }
        });

        llRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DataRecyclerViewActivity.class));
            }
        });
    }

}
