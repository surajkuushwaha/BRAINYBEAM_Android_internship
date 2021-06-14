package com.internship;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText email,password;
    TextView signup;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login Activity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        login = findViewById(R.id.login_button);
        email = findViewById(R.id.login_email);
        password = findViewById(R.id.login_password);
        signup = findViewById(R.id.login_create_account);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().trim().equals("")){
                    email.setError("Email is required");
                }else if(!email.getText().toString().trim().matches(emailPattern)){
                    email.setError("Valid email id required");
                }
                else if(password.getText().toString().trim().equals("")){
                    password.setError("Password is required");
                }else {
                    if(email.getText().toString().trim().equals("admin@admin.com")&&password.getText().toString().trim().equals("admin")){
                        System.out.println("Button clicked!!!!!!!!");
                        Log.d("Print", "Button clicked log!!!!!");
                        Log.e("Print", "Button clicked log!!!!!");
                        Toast.makeText(LoginActivity.this, "Login sucessfull", Toast.LENGTH_SHORT).show();
                        Snackbar.make(v, "Login sucessfull", BaseTransientBottomBar.LENGTH_SHORT).show();

                        Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                        startActivity(intent);

                    }else{
                        System.out.println("Button clicked!!!!!!!!");
                        Log.d("Print", "Button clicked log!!!!!");
                        Log.e("Print", "Button clicked log!!!!!");
                        Toast.makeText(LoginActivity.this, "Login unsucessfull", Toast.LENGTH_SHORT).show();
                        Snackbar.make(v, "Login unsucessfull", BaseTransientBottomBar.LENGTH_SHORT).show();

                    }
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}