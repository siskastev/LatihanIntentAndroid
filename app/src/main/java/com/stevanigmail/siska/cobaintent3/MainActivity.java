package com.stevanigmail.siska.cobaintent3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText textNama, textPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNama=findViewById(R.id.TextNama);
        textPass=findViewById(R.id.TextPassword);
        btnLogin=findViewById(R.id.buttonLog);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NextActivity.class);
                intent.putExtra(NextActivity.KEY_NAMA,textNama.getText().toString());
                intent.putExtra(NextActivity.KEY_PASS,textPass.getText().toString());
                startActivity(intent);
            }
        });







    }
}
