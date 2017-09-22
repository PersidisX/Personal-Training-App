package com.example.persidis.personaltrainingv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDiatrofh3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cativity_diatrofh3);


        Intent intent = getIntent();
        String askValue = intent.getStringExtra("diatrofhMsgV2");
        TextView askTxt = (TextView) findViewById(R.id.askTextView);
        TextView largeAskText = (TextView) findViewById(R.id.largeAskTextView);
        ImageView img = (ImageView)findViewById(R.id.imageView);
        askTxt.setText(askValue);


        switch (askValue){
            case "Θερμίδες":
                largeAskText.setText(R.string.thermides);
               // img.setImageResource(R.drawable.android1);
                break;
            case "Υδατάνθρακες":
                largeAskText.setText(R.string.ydatanthrakes);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Πρωτείνες":
                largeAskText.setText(R.string.proteines);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Λίπη":
                largeAskText.setText(R.string.liph);
                //img.setImageResource(R.drawable.android1);
                break;

            case "Βιταμήνη D":
                largeAskText.setText(R.string.bitD);


                //img.setImageResource(R.drawable.android1);
                break;
            case "Βιταμήνη Ε":
                largeAskText.setText(R.string.bitE);
                break;

            case"Μαγνήσιο":
                largeAskText.setText(R.string.magnisio);

                break;
            case"Ασβέστιο":
                largeAskText.setText(R.string.asvestio);

                break;
            case"Φώσφορος":
                largeAskText.setText(R.string.fwsforos);

                break;
            case"Κάλιο":
                largeAskText.setText(R.string.kalio);

                break;
            case"Νάτριο":
                largeAskText.setText(R.string.natrio);

                break;


            case "Νερό":
                largeAskText.setText(R.string.nero);
                // img.setImageResource(R.drawable.android1);
            case "Ενω δεν τρώω πολύ ,δεν μπορώ να χάσω βάρος":
                largeAskText.setText(R.string.Mythos1);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Υγιεινή διατροφή σημαίνει στέρηση των αγαπημένων φαγητών και ανησυχία του τι θα ΄φαω":
                largeAskText.setText(R.string.Mythos2);
                //img.setImageResource(R.drawable.android1);
                break;

            case "Η αφυδάτωση συσχετίζεται με ημικρανίες και πονοκεφάλους":
                largeAskText.setText(R.string.Mythos3);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Οι υδατάνθρακες δεν προκαλούν μεγαλύτερη αύξηση βάρους απο ότι οι πρωτεϊνες και τα λίπη":
                largeAskText.setText(R.string.Mythos4);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Τα συμπληρώματα διατροφής είναι ακίνδυνα":
                largeAskText.setText(R.string.Mythos5);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Πρωινό":
                largeAskText.setText(R.string.prwino);
                //img.setImageResource(R.drawable.android1);
                break;

            case "Δεκατιανό":
                largeAskText.setText(R.string.dekatiano);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Μεσημεριανό":
                largeAskText.setText(R.string.meshmeriano);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Απογευματινό":
                largeAskText.setText(R.string.apogeumatino);
                //img.setImageResource(R.drawable.android1);
                break;


            case "Βραδινό":
                largeAskText.setText(R.string.bradino);
                //img.setImageResource(R.drawable.android1);
                break;

            case "Οδηγία 1":
                largeAskText.setText(R.string.odhgia1);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Οδηγία 2":
                largeAskText.setText(R.string.odhgia2);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Οδηγία 3":
                largeAskText.setText(R.string.odhgia3);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Οδηγία 4":
                largeAskText.setText(R.string.odhgia4);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Οδηγία 5":
                largeAskText.setText(R.string.odhgia5);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Οδηγία 6":
                largeAskText.setText(R.string.odhgia6);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Να τρώτε αρκετά":
                largeAskText.setText(R.string.lathi1);
                //img.setImageResource(R.drawable.android1);
                break;

            case "Μην αποφεύγετε την καφεϊνη":
                largeAskText.setText(R.string.lathi2);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Φυτικές Ίνεςς":
                largeAskText.setText(R.string.lathi3);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Μην πίνετε νερό σε θερμοκρασία δωματίου":
                largeAskText.setText(R.string.lathi4);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Όχι τροφές με φυτοφάρμακα":
                largeAskText.setText(R.string.lathi5);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Να τρώτε πρωτεϊνες":
                largeAskText.setText(R.string.lathi6);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Τροφές πλούσιες σε σίδηρο":
                largeAskText.setText(R.string.lathi7);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Μην παραλείπετε σημαντικές βιταμήνες":
                largeAskText.setText(R.string.lathi8);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Λιγότερο αλκόλ":
                largeAskText.setText(R.string.lathi9);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Μην Παραλείπετε γεύματα":
                largeAskText.setText(R.string.lathi10);
                //img.setImageResource(R.drawable.android1);
                break;

            case "Μην τρώτε βιαστικά":
                largeAskText.setText(R.string.lathi11);
                //img.setImageResource(R.drawable.android1);
                break;

            case "Μην το παρακάνετε το σαββατοκύριακο":
                largeAskText.setText(R.string.lathi12);
                //img.setImageResource(R.drawable.android1);
                break;

            case "Προσοχή στο αλάτι":
                largeAskText.setText(R.string.lathi13);
                //img.setImageResource(R.drawable.android1);
                break;

            case "Καλό πρωινό":
                largeAskText.setText(R.string.sinithia1);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Τρώγε συχνά":
                largeAskText.setText(R.string.sinithia2);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Τρώγε όσε θερμίδες χρειάζεσαι":
                largeAskText.setText(R.string.sinithia3);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Καλός ύπνος":
                largeAskText.setText(R.string.sinithia4);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Αποτοξίνωση":
                largeAskText.setText(R.string.sinithia5);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Μονο η γυμναστική δεν κάνει":
                largeAskText.setText(R.string.sinithia6);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Φρούτα και λαχανικά":
                largeAskText.setText(R.string.sinithia7);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Πίνε περισσότερο νερό":
                largeAskText.setText(R.string.sinithia8);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Περπατήστε":
                largeAskText.setText(R.string.sinithia9);
                //img.setImageResource(R.drawable.android1);
                break;
            case "Ροφήματα":
                largeAskText.setText(R.string.sinithia10);
                //img.setImageResource(R.drawable.android1);
                break;






        }
    }

}
