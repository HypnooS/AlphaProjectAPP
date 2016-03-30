package br.ft.c149122_r149389.alphaproject;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button buttonAction;
    String username;
    Intent intent;
    Spinner spinner;
    TextView usernameText;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameText = (TextView) findViewById(R.id.textRecived);
        spinner = (Spinner) findViewById(R.id.spinner);
        intent = getIntent();
        username = intent.getStringExtra("username");
        usernameText.setText("Seja Bem-vindo, " + username + "\n Qual ação você deseja tomar?");
        buttonAction = (Button) findViewById(R.id.buttonAction);
        //locationCatch();


    }

    private void locationCatch() {
        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        LocationListener locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {


            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        };
    }

    public void onClickAction(View view) {
        if (spinner.getSelectedItemPosition() == 1) {
            Toast.makeText(getApplication(), "Ponto marcado", Toast.LENGTH_LONG).show();
        }
        if (spinner.getSelectedItemPosition() == 2) {
            Toast.makeText(getApplication(), "Ponto Atualizado", Toast.LENGTH_LONG).show();
        }
        if (spinner.getSelectedItemPosition() == 3) {
            intent = new Intent(this, NoteActivity.class);
            startActivity(intent);
        }
    }


}
