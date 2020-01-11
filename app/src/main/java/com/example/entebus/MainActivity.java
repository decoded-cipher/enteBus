package com.example.entebus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup userMode;
    RadioButton temp;
    Button next;
    Intent nxt1, nxt2;
    String modeValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userMode = findViewById(R.id.userMode);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int tempValue = userMode.getCheckedRadioButtonId();
                temp = findViewById(tempValue);
                modeValue = temp.getText().toString();

//                Toast.makeText(MainActivity.this, modeValue , Toast.LENGTH_LONG).show();

                nxt1 = new Intent(getApplicationContext(), PassengerActivity.class);
                nxt2 = new Intent(getApplicationContext(), BusdriverActivity.class);

                if (modeValue.equals("Passenger")){
//                    Toast.makeText(MainActivity.this, "Passenger", Toast.LENGTH_SHORT).show();
                    startActivity(nxt1);
                }
                else {
//                    Toast.makeText(MainActivity.this, "Bus Driver", Toast.LENGTH_SHORT).show();
                    startActivity(nxt2);
                }
            }
        });
    }
}
