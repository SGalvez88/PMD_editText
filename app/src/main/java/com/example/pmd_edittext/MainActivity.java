package com.example.pmd_edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonSumar;
    Button buttonRestar;
    Button buttonMulti;
    Button buttonDiv;
    EditText TxtNum1;
    EditText TxtNum2;
    TextView TxtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSumar = (Button) findViewById(R.id.buttonSumar);
        buttonRestar = (Button) findViewById(R.id.buttonRestar);
        buttonMulti = (Button) findViewById(R.id.buttonMulti);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        TxtNum1 =   (EditText) findViewById(R.id.editTextNumber1);
        TxtNum2 =   (EditText) findViewById(R.id.editTextNumber2);
        TxtResultado = (TextView) findViewById(R.id.textViewResultado);

        buttonSumar.setOnClickListener(this);
        buttonRestar.setOnClickListener(this);
        buttonMulti.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        TxtNum1.setOnClickListener(this);
        TxtNum2.setOnClickListener(this);
        TxtResultado.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int resultado;
        switch (view.getId()){
            case R.id.buttonSumar:
                resultado = Integer.parseInt(TxtNum1.getText().toString())+Integer.parseInt(TxtNum2.getText().toString());
                TxtResultado.setText(String.valueOf(resultado));
                break;
            case R.id.buttonRestar:
                resultado = Integer.parseInt(TxtNum1.getText().toString())-Integer.parseInt(TxtNum2.getText().toString());
                TxtResultado.setText(String.valueOf(resultado));

                break;
            case R.id.buttonMulti:
                resultado = Integer.parseInt(TxtNum1.getText().toString())*Integer.parseInt(TxtNum2.getText().toString());
                TxtResultado.setText(String.valueOf(resultado));

                break;
            case R.id.buttonDiv:
                resultado = Integer.parseInt(TxtNum1.getText().toString())/Integer.parseInt(TxtNum2.getText().toString());
                TxtResultado.setText(String.valueOf(resultado));

                break;
        }
    }
}
