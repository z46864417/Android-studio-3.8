package com.example.checkboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements CompoundButton.OnCheckedChangeListener {
    private CheckBox chkOriginal,chkBeef,chkSeafood;
    private TextView output;
    @Override
    private int[] chkIDs = {R.id.chkOriginal,R.id.chkBeef, R.id.chkSeafood};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        chkOriginal = (CheckBox) findViewById(R.id.chkOriginal);
//        chkBeef = (CheckBox) findViewById(R.id.chkBeef);
//        chkSeafood = (CheckBox) findViewById(R.id.chkSeafood);

        for(int id :chkIDs){
            CheckBox chk = (CheckBox) findViewById(id);
            chk.setOnCheckedChangeListener(this);
        }

        output = (TextView) findViewById(R.id.lblOutput);

//        Button btnConfirm = (Button) findViewById(R.id.btnConfirm);
//        btnConfirm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String str = "";
//                if(chkOriginal.isChecked())
//                    str+=chkOriginal.getText()+"\n";
//                if(chkBeef.isChecked())
//                    str+=chkBeef.getText()+"\n";
//                if(chkSeafood.isChecked())
//                    str+=chkSeafood.getText()+"\n";
//
//                output.setText(str);
//            }
//        });
    }

    @Override


    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        TextView txvStatus = (TextView) findViewById(R.id.txvStatus);
        int id = buttonView.getId();
        String status = "";
        if (id == R.id.chkOriginal) {
            status = (isChecked ? "選取" : "取消" ) +"原味...";
        } else if (id == R.id.chkBeef) {
            status = (isChecked ? "選取" : "取消") +"牛肉...";
        } else if (id == R.id.chkBeef) {
            status = (isChecked ? "選取" : "取消") +"海鮮...";
        }
        txvStatus.setText(status);

        showResult();
    }
    public void  showResult(){
        String str = "";
        for (int i :chkIDs){
            CheckBox chk = (CheckBox) findViewById(i);
            if(chk.isChecked())
                str += chk.getText()+"\n";
        }
        output.setText(str);
    }
}