package com.example.hp.lab5;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


public class MyActivity2 extends ActionBarActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity2);
        init();
    }

    private void init() {
        textView = (TextView) findViewById(R.id.txtView);
        String extraText = getIntent().getStringExtra("EXTRA_TEXT");
        textView.setText(extraText);
    }


}
