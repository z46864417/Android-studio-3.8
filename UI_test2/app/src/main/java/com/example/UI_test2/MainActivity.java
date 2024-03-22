package com.example.UI_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }
    public void sendString(View view){
        EditText edtInput = (EditText) findViewById(R.id.edtInput);
        String string2Send = edtInput.getText().toString();

        Intent intent = new Intent(this,DisplayStringActivity.class);
        intent.putExtra("Input",string2Send);
        startActivity(intent);

    }
}