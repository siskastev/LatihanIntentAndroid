package com.stevanigmail.siska.cobaintent3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FixokActivity extends AppCompatActivity {


    public static String KEY_FIX="fix_ok";
    TextView nama, alamat, nim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixok);

        nama=findViewById(R.id.textnamaOK);
        alamat=findViewById(R.id.textalamatOK);
        nim=findViewById(R.id.textnimOK);

        Intent i = getIntent();
        Data d = (Data) i.getSerializableExtra(KEY_FIX);

        nama.setText(d.getNama());
        alamat.setText(d.getAlamat());
        nim.setText(d.getNim());

    }
}
