package com.example.registration;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Retrieve data from SharedPreferences

        String fnamne = sharedPreferences.getString(fname);
        String lastName = sharedPreferences.getString(KEY_LAST_NAME, "N/A");
        String email = sharedPreferences.getString(KEY_EMAIL, "N/A");
        String phone = sharedPreferences.getString(KEY_PHONE, "N/A");
        String password = sharedPreferences.getString(KEY_PASSWORD, "N/A");
        String dob = sharedPreferences.getString(KEY_DOB, "N/A");
        String gender = sharedPreferences.getString(KEY_GENDER, "N/A");

        // Find TextView to display the data
        TextView txtDetails = findViewById(R.id.d1);

        // Display data
        String details = "First Name: " + firstName + "\n\n" +
                "Last Name: " + lastName + "\n\n" +
                "Gender: " + gender + "\n\n" +
                "Email: " + email + "\n\n" +
                "Phone: " + phone + "\n\n" +
                "Password: " + "********" + "\n\n" + // Mask password
                "Date of Birth: " + dob;

        txtDetails.setText(details);
    }



    }
}
