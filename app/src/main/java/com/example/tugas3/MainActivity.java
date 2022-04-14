package com.example.tugas3;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void input(View view) {

        EditText inputTima = findViewById(R.id.Tima);
        EditText inputTimb = findViewById(R.id.Timb);

        String namaTima = inputTima.getText().toString();
        Log.d(TAG, namaTima);
        String namaTimb = inputTimb.getText().toString();
        Log.d(TAG, namaTimb);

        Intent intent = new Intent(MainActivity.this, skor.class);
        intent.putExtra("Tima", namaTima);
        intent.putExtra("Timb", namaTimb);

        startActivity(intent);
    }
}