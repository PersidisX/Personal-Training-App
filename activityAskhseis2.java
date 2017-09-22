package com.example.persidis.personaltrainingv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class activityAskhseis2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashkseis_activity2);

        String[] xeria = {"Άσκηση 1","Άσκηση 2","Άσκηση 3","Άσκηση 4","Άσκηση 5","Άσκηση 6","Άσκηση 7","Άσκηση 8","Άσκηση 9","Άσκηση 10"};
        String[] podia = {"podia1","podia2","podia3","podia4","podia5","podia6","podia7","podia8"};
        String[] pushups = {"Stithos","Stithos","Stithos","Stithos"};
        String[] koiliakoi = {"Plati","Plati","Plati","Plati"};
        String[] pullup = {"Plati","Plati","Plati","Plati"};


        Intent intent = getIntent();
        String askValue = intent.getStringExtra("askhseisMsg");
       /* TextView askTxt = (TextView) findViewById(R.id.askTextView);
        TextView largeAskText = (TextView) findViewById(R.id.largeAskTextView);
        ImageView img = (ImageView)findViewById(R.id.imageView);
        askTxt.setText(askValue);*/



        switch (askValue){
            case "Ασκήσεις με βάρη":
                ListAdapter bariAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,xeria );
                ListView bariList = (ListView)findViewById(R.id.askhseisListV2);
                bariList.setAdapter(bariAdapter);

                bariList.setOnItemClickListener(
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Intent i = new Intent(activityAskhseis2.this, AskhseiActivity3.class);
                                String ask = String.valueOf(parent.getItemAtPosition(position));
                                i.putExtra("askhseisMsgV2", ask);
                                startActivity(i);
                                //Toast.makeText(MainActivity.this,ask,Toast.LENGTH_LONG).show();
                                //startActivity(new Intent(MainActivity.this,AskhseisActivity.class));
                            }

                        }
                );
                break;
            case "Ασκήσεις ποδιών":
                ListAdapter podiaAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,podia );
                ListView podiaList = (ListView)findViewById(R.id.askhseisListV2);
                podiaList.setAdapter(podiaAdapter);
                podiaList.setOnItemClickListener(
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Intent i = new Intent(activityAskhseis2.this, AskhseiActivity3.class);
                                String ask = String.valueOf(parent.getItemAtPosition(position));
                                i.putExtra("askhseisMsgV2", ask);
                                startActivity(i);
                                //Toast.makeText(MainActivity.this,ask,Toast.LENGTH_LONG).show();
                                //startActivity(new Intent(MainActivity.this,AskhseisActivity.class));
                            }

                        }
                );
                break;
            case "Push ups":
                ListAdapter pushAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pushups );
                ListView pushList = (ListView)findViewById(R.id.askhseisListV2);
                pushList.setAdapter(pushAdapter);

                pushList.setOnItemClickListener(
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Intent i = new Intent(activityAskhseis2.this, AskhseiActivity3.class);
                                String ask = String.valueOf(parent.getItemAtPosition(position));
                                i.putExtra("askhseisMsgV2", ask);
                                startActivity(i);
                                //Toast.makeText(MainActivity.this,ask,Toast.LENGTH_LONG).show();
                                //startActivity(new Intent(MainActivity.this,AskhseisActivity.class));
                            }

                        }
                );
                break;
            case "Κοιλιακοί":
                ListAdapter absAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,koiliakoi );
                ListView absList = (ListView)findViewById(R.id.askhseisListV2);
                absList.setAdapter(absAdapter);
                absList.setOnItemClickListener(
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Intent i = new Intent(activityAskhseis2.this, AskhseiActivity3.class);
                                String ask = String.valueOf(parent.getItemAtPosition(position));
                                i.putExtra("askhseisMsgV2", ask);
                                startActivity(i);
                                //Toast.makeText(MainActivity.this,ask,Toast.LENGTH_LONG).show();
                                //startActivity(new Intent(MainActivity.this,AskhseisActivity.class));
                            }

                        }
                );
                break;
            case "Έλξεις":
                ListAdapter pullAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pullup );
                ListView pullList = (ListView)findViewById(R.id.askhseisListV2);
                pullList.setAdapter(pullAdapter);
                pullList.setOnItemClickListener(
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Intent i = new Intent(activityAskhseis2.this, AskhseiActivity3.class);
                                String ask = String.valueOf(parent.getItemAtPosition(position));
                                i.putExtra("askhseisMsgV2", ask);
                                startActivity(i);
                                //Toast.makeText(MainActivity.this,ask,Toast.LENGTH_LONG).show();
                                //startActivity(new Intent(MainActivity.this,AskhseisActivity.class));
                            }

                        }
                );
                break;

        }


    }

}
