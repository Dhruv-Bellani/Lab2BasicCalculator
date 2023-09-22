package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view)
    {
        EditText firstField = (EditText) findViewById(R.id.editTextNumber2);
        EditText secondField = (EditText) findViewById(R.id.editTextNumber);

        if(firstField.getText().toString().trim().isEmpty() || secondField.getText().toString().trim().isEmpty())
        {
            Toast.makeText(MainActivity.this, "Please enter correct inputs", Toast.LENGTH_LONG).show();
        }
        else
        {
            float firstNum = Float.parseFloat(firstField.getText().toString());
            float secondNum = Float.parseFloat(secondField.getText().toString());

            goToActivity(firstNum + secondNum);

        }
    }

    public void subtractFunction(View view)
    {
        EditText firstField = (EditText) findViewById(R.id.editTextNumber2);
        EditText secondField = (EditText) findViewById(R.id.editTextNumber);

        if(firstField.getText().toString().trim().isEmpty() || secondField.getText().toString().trim().isEmpty())
        {
            Toast.makeText(MainActivity.this, "Please enter correct inputs", Toast.LENGTH_LONG).show();
        }
        else
        {
            float firstNum = Float.parseFloat(firstField.getText().toString());
            float secondNum = Float.parseFloat(secondField.getText().toString());

            goToActivity(firstNum - secondNum);

        }
    }

    public void multiplyFunction(View view)
    {
        EditText firstField = (EditText) findViewById(R.id.editTextNumber2);
        EditText secondField = (EditText) findViewById(R.id.editTextNumber);

        if(firstField.getText().toString().trim().isEmpty() || secondField.getText().toString().trim().isEmpty())
        {
            Toast.makeText(MainActivity.this, "Please enter correct inputs", Toast.LENGTH_LONG).show();
        }
        else
        {
            float firstNum = Float.parseFloat(firstField.getText().toString());
            float secondNum = Float.parseFloat(secondField.getText().toString());

            goToActivity(firstNum * secondNum);

        }
    }

    public void divideFunction(View view)
    {
        EditText firstField = (EditText) findViewById(R.id.editTextNumber2);
        EditText secondField = (EditText) findViewById(R.id.editTextNumber);

        if(firstField.getText().toString().trim().isEmpty() || secondField.getText().toString().trim().isEmpty() || Integer.parseInt(secondField.getText().toString()) == 0)
        {
            Toast.makeText(MainActivity.this, "Please enter correct inputs", Toast.LENGTH_LONG).show();
        }
        else
        {
            float firstNum = Float.parseFloat(firstField.getText().toString());
            float secondNum = Float.parseFloat(secondField.getText().toString());

            goToActivity(firstNum * secondNum);

        }
    }


    public void goToActivity(float i)
    {
        Intent intent = new Intent(this, OutputScreen.class);
        intent.putExtra("message", String.valueOf(i));
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}