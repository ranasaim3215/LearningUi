package com.example.learningui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    TextView t3;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.name);
        t2=findViewById(R.id.pass);
        b1=findViewById(R.id.btn);
        b2=findViewById(R.id.btn2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3=findViewById(R.id.data);
                int a = Integer.parseInt(t1.getText().toString());
                int b = Integer.parseInt(t2.getText().toString());
                int c=a+b;

                t3.setText("Answer is ="+c);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3=findViewById(R.id.data);
                int a = Integer.parseInt(t1.getText().toString());
                int b = Integer.parseInt(t2.getText().toString());
                int c=a-b;

                t3.setText("Answer is ="+c);
            }
        });
    }

}