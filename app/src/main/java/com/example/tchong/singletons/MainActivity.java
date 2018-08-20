package com.example.tchong.singletons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText user,contra;
    private static Singleton singleton=null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText)findViewById(R.id.Nombre);
        contra=(EditText)findViewById(R.id.Password);

        findViewById(R.id.Button).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Button:
                actualizar();
                break;
        }
    }

    private void actualizar() {
        String uno= user.getText().toString();
        String dos= contra.getText().toString();
        Singleton.getInstance().setEmail(uno);
        Singleton.getInstance().setUser(dos);
        startActivity(new Intent(this,ResultActivity.class));



    }
}
