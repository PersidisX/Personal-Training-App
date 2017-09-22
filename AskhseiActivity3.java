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

public class AskhseiActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_askhsei3);


        Intent intent = getIntent();
        String askValue = intent.getStringExtra("askhseisMsgV2");
        TextView askTxt = (TextView) findViewById(R.id.askTextView);
        TextView largeAskText = (TextView) findViewById(R.id.largeAskTextView);
        ImageView img = (ImageView)findViewById(R.id.imageView);
        ImageView img2 = (ImageView)findViewById(R.id.imageView2);
        ImageView img3 = (ImageView)findViewById(R.id.imageView3);
        largeAskText.setText(askValue);



        switch (askValue){
            case "Άσκηση 1":
                largeAskText.setText(R.string.xeria1);
                img.setImageResource(R.drawable.hands1_a);
                img2.setImageResource(R.drawable.hands1_b);



                break;
            case "Άσκηση 2":
                largeAskText.setText(R.string.xeria2);
                img.setImageResource(R.drawable.hands2_a);
                img2.setImageResource(R.drawable.hands2_b);
                break;
            case "Άσκηση 3":
                largeAskText.setText(R.string.xeria3);
                img.setImageResource(R.drawable.hands3_a);
                img2.setImageResource(R.drawable.hands3_b);
                break;
            case "Άσκηση 4":
                largeAskText.setText(R.string.xeria4);
                img.setImageResource(R.drawable.hands4_a);
                img2.setImageResource(R.drawable.hands4_b);
                break;
            case "Άσκηση 5":
                largeAskText.setText(R.string.xeria5);
                img.setImageResource(R.drawable.hands5_a);
                img2.setImageResource(R.drawable.hands5_b);
                break;
            case "Άσκηση 6":
                largeAskText.setText(R.string.xeria6);
                img.setImageResource(R.drawable.hands6_a);
                img2.setImageResource(R.drawable.hands6_b);
                break;
            case "Άσκηση 7":
                largeAskText.setText(R.string.xeria7);
                img.setImageResource(R.drawable.hands7_a);
                img2.setImageResource(R.drawable.hands7_b);
                break;
            case "Άσκηση 8":
                largeAskText.setText(R.string.xeria8);
                img.setImageResource(R.drawable.hands8_a);
                img2.setImageResource(R.drawable.hands8_b);
                break;
            case "Άσκηση 9":
                largeAskText.setText(R.string.xeria9);
                img.setImageResource(R.drawable.hands9_a);
                img2.setImageResource(R.drawable.hands9_b);
                break;
            case "Άσκηση 10":
                largeAskText.setText(R.string.xeria10);
                img.setImageResource(R.drawable.hands_10a);
                img2.setImageResource(R.drawable.hands_10b);
                img3.setImageResource(R.drawable.hands_10c);
                break;


            case "Podia1":
                largeAskText.setText("Podia1");
                //img.setImageResource(R.drawable.android1);
                break;
            case "Podia2":
                largeAskText.setText("Podia2");
                //img.setImageResource(R.drawable.android1);
                break;
            case "Podia3":
                largeAskText.setText("Podia3");
                //img.setImageResource(R.drawable.android1);
                break;
            case "Podia4":
                largeAskText.setText("Podia4");
                //img.setImageResource(R.drawable.android1);
                break;
            case "Podia5":
                largeAskText.setText("Podia5");
                //img.setImageResource(R.drawable.android1);
                break;
            case "Podia6":
                largeAskText.setText("Podia6");
                //img.setImageResource(R.drawable.android1);
                break;
            case "Podia7":
                largeAskText.setText("Podia7");
                //img.setImageResource(R.drawable.android1);
                break;
            case "Podia8":
                largeAskText.setText("Podia8");
                //img.setImageResource(R.drawable.android1);
                break;


            case "Stithos1":
                largeAskText.setText("Stithos1");
                //img.setImageResource(R.drawable.android1);
                break;
            case "Stithos2":
                largeAskText.setText("Stithos2");
                //img.setImageResource(R.drawable.android1);
                break;
            case "Stithos3":
                largeAskText.setText("Stithos3");
                //img.setImageResource(R.drawable.android1);
                break;
            case "Stithos4":
                largeAskText.setText("Stithos4");
                //img.setImageResource(R.drawable.android1);
                break;

        }

    }

}
