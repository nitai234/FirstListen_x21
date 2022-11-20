package com.example.firstlisten_x2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText first, second;
    TextView fullName;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (EditText)findViewById(R.id.firstName);
        second = (EditText) findViewById(R.id.lastName);
        fullName = (TextView) findViewById(R.id.text);
        save = (Button) findViewById(R.id.save);

        save.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if(first.getText().toString().length() == 0 || second.getText().toString().length() == 0)
        {
            Toast.makeText(this,"נא למלא את כל הפרטים", Toast.LENGTH_LONG).show();
        }
        if(view == save)
        {
            fullName.setText(first.getText().toString() + " " + second.getText().toString());
            first.setText("");
            second.setText("");
        }





    }
}