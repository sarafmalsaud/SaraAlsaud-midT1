package com.example.saraalsaud_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Activity3 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_2);

        ListView listView = findViewById(R.id.list);

        String[] items = {"Alfaisal","Cat","alfaisal2","alfaisal3"};

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.listt,items));

        Button btn3 = (Button) findViewById(R.id.btnMain3);

    btn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(Activity3.this,MainActivity.class));
        }
    });


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        switch (position) {

            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://alfaisal.edu")));
                break;

            case 1:
                startActivity(new Intent(Activity3.this, lisActivity.class));
                break;

            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://alfaisal.edu")));
                break;

            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://alfaisal.edu")));
                break;
        }
    }


}