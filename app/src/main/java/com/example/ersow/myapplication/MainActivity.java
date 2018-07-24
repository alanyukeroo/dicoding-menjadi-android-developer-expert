package com.example.ersow.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtWidth, edtHeight, edtLenght;
    private Button btnCalculate;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtWidth = (EditText)findViewById(R.id.edt_width);
        edtHeight = (EditText)findViewById(R.id.edt_height);
        edtLenght = (EditText)findViewById(R.id.edt_length);
        btnCalculate = (Button) findViewById(R.id.btn_calculate);
        tvResult= (TextView) findViewById(R.id.tv_result);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.btn_calculate){
            String lenght = edtLenght.getText().toString().trim();
            String width = edtWidth.getText().toString().trim();
            String height = edtHeight.getText().toString().trim();
            boolean isEmptyField = false;


            if(TextUtils.isEmpty(lenght)){
                isEmptyField = true;
                edtLenght.setError("Field ini tidak boleh kosong");
            }
            if(TextUtils.isEmpty(width)){
                isEmptyField = true;
                edtLenght.setError("Field ini tidak boleh kosong");
            }
            if(TextUtils.isEmpty(height)) {
                isEmptyField = true;
                edtLenght.setError("Field ini tidak boleh kosong");
            }
            if(!isEmptyField){
                double l = Double.parseDouble(lenght);
                double w = Double.parseDouble(width);
                double h = Double.parseDouble(height);
                double volume = l * w * h;
                tvResult.setText(String.valueOf(volume));
            }
        }
    }
}
