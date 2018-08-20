package com.example.tchong.singletons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView uno,dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        uno=(TextView)findViewById(R.id.result1);
        dos=(TextView)findViewById(R.id.result2);
        uno.setText(Singleton.getInstance().getEmail());
        dos.setText(Singleton.getInstance().getUser());
    }
}
