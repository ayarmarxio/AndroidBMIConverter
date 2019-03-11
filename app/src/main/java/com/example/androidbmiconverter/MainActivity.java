package com.example.androidbmiconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button calculate;
    EditText heightInput;
    EditText weightInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.textView);
        calculate = findViewById(R.id.button);
        heightInput = findViewById(R.id.editText);
        weightInput = findViewById(R.id.editText2);

    }

    public void getBMI (View view){
        Float heightValue = Float.parseFloat(heightInput.getText().toString());
        Float weightValue = Float.parseFloat(weightInput.getText().toString());

        Float bmiValue = weightValue / (heightValue * heightValue);
        result.setText(bmiValue.toString());
    }

}
