package com.example.example_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Dashboard2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("name");
            String age = bundle.getString("age");
            String phone = bundle.getString("phone");
            String email = bundle.getString("email");
            String country = bundle.getString("country");

            TextView tvName = findViewById(R.id.tvName);
            TextView tvAge = findViewById(R.id.tvAge);
            TextView tvPhone = findViewById(R.id.tvPhone);
            TextView tvEmail = findViewById(R.id.tvEmail);
            TextView tvCountry = findViewById(R.id.tvCountry);

            tvName.setText(name);
            tvAge.setText(age);
            tvPhone.setText(phone);
            tvEmail.setText(email);
            tvCountry.setText(country);

        }
    }
}
