package com.stevanigmail.siska.cobaintent3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    public static String KEY_NAMA="nama";
    public static String KEY_PASS="password";

    TextView textNama;
    TextView textUser;

    EditText editNama,editAlamat, editNim;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        textNama=findViewById(R.id.textUser);
        textUser=findViewById(R.id.textPass);
        editNama=findViewById(R.id.editTextNama);
        editAlamat=findViewById(R.id.editTextAlamat);
        editNim=findViewById(R.id.editTextNim);
        btnSubmit=findViewById(R.id.Send);

        final Intent intent=getIntent();
        String strNama = intent.getStringExtra(KEY_NAMA);
        String strPass = intent.getStringExtra(KEY_PASS);

        textNama.setText("HELLO & WELCOME " + strNama+",");
        textUser.setText(strPass);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NextActivity.this,FixokActivity.class);
                Data data = new Data(editNama.getText().toString(),editAlamat.getText().toString(),editNim.getText().toString());
                i.putExtra(FixokActivity.KEY_FIX,data);
                startActivity(i);
            }
        });
    }
}
