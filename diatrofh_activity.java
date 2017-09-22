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
import android.widget.ListAdapter;
import android.widget.ListView;

public class diatrofh_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diatrofh_activity);

        String[] diatrofh = {"Συστατικά","Μύθοι και αλήθειες για την διατορφη" ,"5 γεύματα της ημέρας","6 Οδηγίες για διατροφή","Διατροφικά Λάθη","Συνήθειες που αδυνατίζουν"};

        ListAdapter askhseisApater = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,diatrofh );

        final ListView diatrofhList = (ListView)findViewById(R.id.diatrofhList);
        diatrofhList.setAdapter(askhseisApater);

        diatrofhList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Intent i = new Intent(diatrofh_activity.this, diatrofhActivity.class);
                        String diatrofh = String.valueOf(parent.getItemAtPosition(position));
                        i.putExtra("diatrofhMsg", diatrofh);
                        startActivity(i);
                        //Toast.makeText(MainActivity.this,ask,Toast.LENGTH_LONG).show();
                        //startActivity(new Intent(MainActivity.this,AskhseisActivity.class));
                    }

                }
        );

    }

}
