package br.ft.c149122_r149389.alphaproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class NoteActivity extends Activity {

    Intent intent;
    TextView textView;
    String time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        textView = (TextView) findViewById(R.id.textView);

        textView.setText("Teste");
    }
}
