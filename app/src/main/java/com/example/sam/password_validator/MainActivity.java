package com.example.sam.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText Password = findViewById(R.id.Password);
        final Button Validate = findViewById(R.id.validation);
        final TextView evaluation = findViewById(R.id.evaluation);
        Validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Validator.validate(String.valueOf(Password.getText())) == 5){


                    evaluation.setText("Password is Strong");}
                else{
                    evaluation.setText("Password is Not Strong");
                }
            }
        });

    }
}
