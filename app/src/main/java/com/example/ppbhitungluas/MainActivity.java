package com.example.ppbhitungluas;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;
import java.io.Writer;

public class MainActivity extends AppCompatActivity {
    private EditText edt_panjang, edt_lebar;
    private TextView txt_luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edt_panjang = (EditText) findViewById(R.id.edt_panjang);
        edt_lebar = (EditText) findViewById(R.id.edt_lebar);
        Button btn_hitung = (Button) findViewById(R.id.btn_hitung);
        txt_luas = (TextView) findViewById(R.id.txt_luas);

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_panjang = edt_panjang.getText().toString().trim();
                String str_lebar = edt_lebar.getText().toString().trim();

                double panjang = Double.parseDouble((str_panjang.equals("") ? "0" : str_panjang));
                double lebar = Double.parseDouble((str_lebar.equals("") ? "0" : str_lebar));
                double luas = panjang * lebar;

                txt_luas.setText("Luas : " + luas);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}