package com.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignupActivity extends AppCompatActivity {

//    RadioButton male,female,transgender;
    RadioGroup gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().setTitle("Signup");
        gender = findViewById(R.id.signup_gender);
        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id=gender.getCheckedRadioButtonId();
                RadioButton rb = findViewById(id);
                new CommonMethod(SignupActivity.this,rb.getText().toString());
            }
        });
//        male = findViewById(R.id.signup_male);
//        female = findViewById(R.id.signup_female);
//        transgender = findViewById(R.id.signup_transgender);
//        male.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new CommonMethod(SignupActivity.this,male.getText().toString());
//            }
//        });
//        female.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new CommonMethod(SignupActivity.this,female.getText().toString());
//            }
//        });
//        transgender.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new CommonMethod(SignupActivity.this,transgender.getText().toString());
//            }
//        });

        
    }
}