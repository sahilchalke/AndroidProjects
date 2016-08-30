package com.example.sahil.calculator;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class CalcActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    String leftStr;
    String rightStr;
    Operation currentOperation;
    int result =0;
    TextView resultDisp;
    String runningNumber="";

    public enum Operation{
        ADD, SUBTRACT, DIVIDE, MULTIPLY, EQUAL
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Button oneBtn = (Button) findViewById(R.id.oneBtn);
        Button twoBtn = (Button) findViewById(R.id.twoBtn);
        Button threeBtn = (Button) findViewById(R.id.threeBtn);
        Button fourBtn = (Button) findViewById(R.id.fourBtn);
        Button fiveBtn = (Button) findViewById(R.id.fiveBtn);
        Button sixBtn = (Button) findViewById(R.id.sixBtn);
        Button sevenBtn = (Button) findViewById(R.id.sevenBtn);
        Button eightBtn = (Button) findViewById(R.id.eightBtn);
        Button nineBtn = (Button) findViewById(R.id.nineBtn);
        Button zeroBtn = (Button) findViewById(R.id.zeroBtn);
        Button clearBtn = (Button) findViewById(R.id.clearBtn);

        ImageButton calcBtn = (ImageButton) findViewById(R.id.calcBtn);
        ImageButton addBtn = (ImageButton) findViewById(R.id.addBtn);
        ImageButton subBtn = (ImageButton) findViewById(R.id.minusBtn);
        ImageButton divBtn = (ImageButton) findViewById(R.id.divideBtn);
        ImageButton multBtn = (ImageButton) findViewById(R.id.multBtn);

        resultDisp = (TextView) findViewById(R.id.resultTxt);
        resultDisp.setText("");

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                    numberPressed(1);
            }

        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                numberPressed(2);
            }

        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                numberPressed(3);
            }

        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                numberPressed(4);
            }

        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                numberPressed(5);
            }

        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                numberPressed(6);
            }

        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                numberPressed(7);
            }

        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                numberPressed(8);
            }

        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                numberPressed(9);
            }

        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                numberPressed(0);
            }

        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                leftStr = "";
                rightStr = "";
                runningNumber = "";
                currentOperation = null;
                result=0;
                resultDisp.setText("0");
            }

        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                processOperation(Operation.ADD);
            }

        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                processOperation(Operation.SUBTRACT);
            }

        });

        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                processOperation(Operation.MULTIPLY);
            }

        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                processOperation(Operation.DIVIDE);
            }

        });

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                processOperation(Operation.EQUAL);
            }

        });
  }

    public void numberPressed(int number){
        runningNumber+=String.valueOf(number);
        resultDisp.setText(runningNumber);
    }

    public void processOperation(Operation operation){
        if(currentOperation!=null) {
            if (runningNumber != "") {
                rightStr = runningNumber;
                runningNumber = "";

                switch (currentOperation) {
                    case ADD:
                        result = Integer.parseInt(leftStr) + Integer.parseInt(rightStr);
                        break;

                    case SUBTRACT:
                        result = Integer.parseInt(leftStr) - Integer.parseInt(rightStr);
                        break;

                    case DIVIDE:
                        result = Integer.parseInt(leftStr) / Integer.parseInt(rightStr);
                        break;

                    case MULTIPLY:
                        result = Integer.parseInt(leftStr) *     Integer.parseInt(rightStr);
                        break;
                }

                leftStr = String.valueOf(result);
                resultDisp.setText(leftStr);
            }
        }

        else{
            leftStr=runningNumber;
            runningNumber="";
        }
        currentOperation = operation;
    }

}
