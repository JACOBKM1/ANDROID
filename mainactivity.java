package com.example.registration;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void login(View view) {
        SharedPreferences indhu=getSharedPreferences("manu",MODE_PRIVATE);
        SharedPreferences.Editor jeril=indhu.edit();

        EditText ffname = findViewById(R.id.editTextText9);
        EditText llname = findViewById(R.id.editTextText10);

        EditText eemail = findViewById(R.id.editTextText11);
        EditText nnum = findViewById(R.id.editTextText12);
        EditText ndob = findViewById(R.id.editTextText13);
        EditText npassword = findViewById(R.id.editTextText14);


        jeril.putString("fname", ffname.getText().toString());
        jeril.putString("lname", llname.getText().toString());

        jeril.putString("email", eemail.getText().toString());
        jeril.putString("num", nnum.getText().toString());
        jeril.putString("dob", ndob.getText().toString());
        jeril.putString("password", npassword.getText().toString());
        jeril.apply();
        Toast.makeText(this, "Registration Success.", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    }





