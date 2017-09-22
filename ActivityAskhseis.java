package com.example.persidis.personaltrainingv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ActivityAskhseis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.askhseis_activity);

        String[] askhseis = {"Ασκήσεις με βάρη","Ασκήσεις ποδιών","Push ups","Κοιλιακοί","Έλξεις"};

        ListAdapter askhseisApater = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,askhseis );

        final ListView askList = (ListView)findViewById(R.id.askhseisList);
        askList.setAdapter(askhseisApater);


        askList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Intent i = new Intent(ActivityAskhseis.this, activityAskhseis2.class);
                        String ask = String.valueOf(parent.getItemAtPosition(position));
                        i.putExtra("askhseisMsg", ask);
                        startActivity(i);
                        //Toast.makeText(MainActivity.this,ask,Toast.LENGTH_LONG).show();
                        //startActivity(new Intent(MainActivity.this,AskhseisActivity.class));
                    }

                }
        );





    }

}
