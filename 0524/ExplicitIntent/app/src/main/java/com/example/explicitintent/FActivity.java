package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class FActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factivity);

        convertTempure();

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void convertTempure(){
        int c ;
        double f = 0.0;
        String place = "";
        Bundle bundle = this.getIntent().getExtras();
        if(bundle != null){
            c = bundle.getInt("TEMPC",0);
            f = (9.0*c)/5.0+32.0;
            place = bundle.getString("PLACE","");
            TextView output=(TextView) findViewById(R.id.lblOutput);
            output.setText(place+"\n華氏溫度"+String.format("%.2f", f));
        }
    }
}