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

public class diatrofhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diatrofh2);


        String[] sustatika = {"Θερμίδες","Υδατάνθρακες","Πρωτείνες","Λίπη","Βιταμήνη D","Βιταμήνη Ε","Μαγνήσιο","Ασβέστιο","Φώσφορος","Κάλιο","Νάτριο","Νερό"};
        String[] mythoi = {"Ενω δεν τρώω πολύ ,δεν μπορώ να χάσω βάρος","Υγιεινή διατροφή σημαίνει στέρηση των αγαπημένων φαγητών και ανησυχία του τι θα ΄φαω",
                "Η αφυδάτωση συσχετίζεται με ημικρανίες και πονοκεφάλους","Οι υδατάνθρακες δεν προκαλούν μεγαλύτερη αύξηση βάρους απο ότι οι πρωτεϊνες και τα λίπη",
                "Τα συμπληρώματα διατροφής είναι ακίνδυνα"};
        String[] geumata = {"Πρωινό", "Δεκατιανό","Μεσημεριανό","Απογευματινό","Βραδινό"};
        String[] odhgies = {"Οδηγία 1" ,"Οδηγία 2","Οδηγία 3","Οδηγία 4","Οδηγία 5","Οδηγία 6"};
        String[] lathi = {"Να τρώτε αρκετά","Μην αποφεύγετε την καφεϊνη","Μην επιλέγεται λευκούς υδατάνθρακες","Μην πίνετε νερό σε θερμοκρασία δωματίου","Όχι τροφές με φυτοφάρμακα",
                "Να τρώτε πρωτεϊνες","Τροφές πλούσιες σε σίδηρο","Μην παραλείπετε σημαντικές βιταμήνες",
                "Λιγότερο αλκόλ","Μην Παραλείπετε γεύματα","Μην τρώτε βιαστικά","Μην το παρακάνετε το σαββατοκύριακο","Προσοχή στο αλάτι"};
        String[] sunhthies = {"Καλό πρωινό","Τρώγε συχνά","Τρώγε όσε θερμίδες χρειάζεσαι","Καλός ύπνος","Αποτοξίνωση","Μονο η γυμναστική δεν κάνει","Φρούτα και λαχανικά","Πίνε περισσότερο νερό","Περπατήστε","Ροφήματα"};


        Intent intent = getIntent();
        String askValue = intent.getStringExtra("diatrofhMsg");
       /* TextView askTxt = (TextView) findViewById(R.id.diatrofhTextView);
        TextView largeAskText = (TextView) findViewById(R.id.largedDiatrofhTextView);
        ImageView img = (ImageView)findViewById(R.id.imageView);
        askTxt.setText(askValue);*/



        switch (askValue){
            case "Συστατικά":
                ListAdapter sustatikaAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,sustatika );
                ListView sustatikaList = (ListView)findViewById(R.id.diatrofhListV2);
                sustatikaList.setAdapter(sustatikaAdapter);

                sustatikaList.setOnItemClickListener(
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Intent i = new Intent(diatrofhActivity.this, ActivityDiatrofh3.class);
                                String ask = String.valueOf(parent.getItemAtPosition(position));
                                i.putExtra("diatrofhMsgV2", ask);
                                startActivity(i);
                                //Toast.makeText(MainActivity.this,ask,Toast.LENGTH_LONG).show();
                                //startActivity(new Intent(MainActivity.this,AskhseisActivity.class));
                            }

                        }
                );
                break;
            case "Μύθοι και αλήθειες για την διατορφη":

                ListAdapter mythoiAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,mythoi );
                ListView mythoiList = (ListView)findViewById(R.id.diatrofhListV2);
                mythoiList.setAdapter(mythoiAdapter);

                mythoiList.setOnItemClickListener(
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Intent i = new Intent(diatrofhActivity.this, ActivityDiatrofh3.class);
                                String ask = String.valueOf(parent.getItemAtPosition(position));
                                i.putExtra("diatrofhMsgV2", ask);
                                startActivity(i);
                                //Toast.makeText(MainActivity.this,ask,Toast.LENGTH_LONG).show();
                                //startActivity(new Intent(MainActivity.this,AskhseisActivity.class));
                            }

                        }
                );
                break;
            case "5 γεύματα της ημέρας":

                ListAdapter geumataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,geumata );
                ListView geumataList = (ListView)findViewById(R.id.diatrofhListV2);
                geumataList.setAdapter(geumataAdapter);

                geumataList.setOnItemClickListener(
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Intent i = new Intent(diatrofhActivity.this, ActivityDiatrofh3.class);
                                String ask = String.valueOf(parent.getItemAtPosition(position));
                                i.putExtra("diatrofhMsgV2", ask);
                                startActivity(i);
                                //Toast.makeText(MainActivity.this,ask,Toast.LENGTH_LONG).show();
                                //startActivity(new Intent(MainActivity.this,AskhseisActivity.class));
                            }

                        }
                );
                break;
            case "6 Οδηγίες για διατροφή":

                ListAdapter odhgiesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,odhgies );
                ListView odhgiesList = (ListView)findViewById(R.id.diatrofhListV2);
                odhgiesList.setAdapter(odhgiesAdapter);

                odhgiesList.setOnItemClickListener(
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Intent i = new Intent(diatrofhActivity.this, ActivityDiatrofh3.class);
                                String ask = String.valueOf(parent.getItemAtPosition(position));
                                i.putExtra("diatrofhMsgV2", ask);
                                startActivity(i);
                                //Toast.makeText(MainActivity.this,ask,Toast.LENGTH_LONG).show();
                                //startActivity(new Intent(MainActivity.this,AskhseisActivity.class));
                            }

                        }
                );
                break;
            case "Διατροφικά Λάθη":

                ListAdapter lathiAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,lathi );
                ListView lathiList = (ListView)findViewById(R.id.diatrofhListV2);
                lathiList.setAdapter(lathiAdapter);

                lathiList.setOnItemClickListener(
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Intent i = new Intent(diatrofhActivity.this, ActivityDiatrofh3.class);
                                String ask = String.valueOf(parent.getItemAtPosition(position));
                                i.putExtra("diatrofhMsgV2", ask);
                                startActivity(i);
                                //Toast.makeText(MainActivity.this,ask,Toast.LENGTH_LONG).show();
                                //startActivity(new Intent(MainActivity.this,AskhseisActivity.class));
                            }

                        }
                );
                break;
            case "Συνήθειες που αδυνατίζουν":
                ListAdapter sunithiesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,sunhthies );
                ListView sunithiesList = (ListView)findViewById(R.id.diatrofhListV2);
                sunithiesList.setAdapter(sunithiesAdapter);

                sunithiesList.setOnItemClickListener(
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                Intent i = new Intent(diatrofhActivity.this, ActivityDiatrofh3.class);
                                String ask = String.valueOf(parent.getItemAtPosition(position));
                                i.putExtra("diatrofhMsgV2", ask);
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
