package com.example.hp.lab5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MyActivity extends ActionBarActivity {

    EditText editText;
    Button sendbtn;
    Button capbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        init();
    }

    private void init() {
        editText = (EditText) findViewById(R.id.txtField);
        sendbtn = (Button) findViewById(R.id.sendBtn);
        capbtn = (Button) findViewById(R.id.capBtn);


        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = editText.getText().toString();
                Intent intent = new Intent(MyActivity.this, MyActivity2.class);
                intent.putExtra("EXTRA_TEXT", txt);
                startActivity(intent);
            }
        });

        capbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = editText.getText().toString();
                String captxt = txt.toUpperCase();
                Intent intent = new Intent(MyActivity.this, MyActivity2.class);
                intent.putExtra("EXTRA_TEXT", captxt);
                startActivity(intent);
            }
        });
    }


}
