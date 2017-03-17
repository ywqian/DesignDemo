package com.android.demo.design.sfactory.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.demo.design.R;
import com.android.demo.design.sfactory.Operate;
import com.android.demo.design.sfactory.OperationFactory;

public class SimpleFactoryActivity extends AppCompatActivity {

    private EditText numberA, numberB;
    private Spinner operateSpinner;
    private TextView tvResult;
    private Button btnCalculate;

    private String operate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_factory);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initView();
    }

    private void initView() {
        numberA = (EditText) findViewById(R.id.et_numberA);
        numberB = (EditText) findViewById(R.id.et_numberB);
        operateSpinner = (Spinner) findViewById(R.id.operation_spinner);
        btnCalculate = (Button) findViewById(R.id.btn_calculate);
        tvResult = (TextView) findViewById(R.id.tv_result);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = numberA.getText().toString();
                String b = numberB.getText().toString();


                Operate o = OperationFactory.createOperate(operate);
                o.setNumberA(convert(a));
                o.setNumberB(convert(b));

                tvResult.setText(String.format("%s", o.operate()));


            }
        });
        operateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                operate = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private double convert(String number) {
        return Double.parseDouble(number);
    }

}
