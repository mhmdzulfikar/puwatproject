package com.example.puwat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView currentDate = findViewById(R.id.currentDate);
        String date = new SimpleDateFormat("MM/dd/yyyyy", Locale.getDefault()).format(new Date());
        currentDate.setText(date);
    }
}