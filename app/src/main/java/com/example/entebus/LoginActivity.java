package com.example.entebus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button login, register;
    String user, pass;
    Intent log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        login = findViewById(R.id.login);
        register = findViewById(R.id.register);

        user = username.getText().toString();
        pass = password.getText().toString();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                log = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(log);
            }
        });

    }
}
