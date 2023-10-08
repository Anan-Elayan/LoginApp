package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText userName;
    private EditText password;

    Account account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);    // at the center between xml and java
        account = new Account("Anan" , "123");
        userName =  findViewById(R.id.txtUserName);
        password = findViewById(R.id.txtPassword);
    }
    public void ActionLogin(View view) {
        String name = userName.getText().toString();
        String passwd = password.getText().toString();
        if(name.equals(account.getUserName()) &&passwd.equals(account.getPassword())){
            Toast.makeText(this, "Correct Account", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Filler Account", Toast.LENGTH_SHORT).show();
        }
    }
}