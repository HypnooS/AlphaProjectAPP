package br.ft.c149122_r149389.alphaproject;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText textUsername;
    EditText textPassword;
    public String username;
    Button buttonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textUsername = (EditText) findViewById(R.id.textUsername);
        textPassword = (EditText) findViewById(R.id.textPassword);

    }
    public void onClickButtonLogin(View view){
            username = textUsername.getText().toString();
            if (username.equals("admin") && textPassword.getText().toString().equals("admin")){
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("username",username);
                startActivity(intent);
            }else{
                Toast.makeText(this, "Senha errada", Toast.LENGTH_SHORT).show();
            }


    }
}
