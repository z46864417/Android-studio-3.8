package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected  void OnPause(){
        super.onPause();
        SharedPreferences appSharePrefs = getSharedPreferences("pre_value",MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = appSharePrefs.edit();
        prefsEditor.putString("newItem",(new Integer(theValue)).toString());
        prefsEditor.commit();
    }
    @Override
    protected void onResume(){
        super.onResume();
        SharedPreferences appSharePrefs = getSharedPreferences("pre_valus")
        theValue = (new Integer(appSharePrefs.getString()))
    }
    public void  onWindowFocusChanged (boolean hasFocus){
        GridLayout keyGL = (Gr)
    }
}