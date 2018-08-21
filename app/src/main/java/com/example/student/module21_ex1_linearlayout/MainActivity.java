package com.example.student.module21_ex1_linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText text_numA=(EditText)findViewById(R.id.text_numA);
        final EditText text_numB=(EditText)findViewById(R.id.text_numB);
        final Button btn_plus=(Button)findViewById(R.id.btn_plus);
        final Button btn_minus=(Button)findViewById(R.id.btn_minus);
        final Button btn_mutil=(Button)findViewById(R.id.btn_mutil);
        final Button btn_divide=(Button)findViewById(R.id.btn_divide);
        final Button btn_exit=(Button)findViewById(R.id.btn_exit);

        final TextView label_result=(TextView)findViewById(R.id.label_result);


        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkValidInput()){
                    label_result.setText("Dữ liệu nhập không hợp lệ");
                    return;
                }
                double a=Double.parseDouble(text_numA.getText().toString());
                double b=Double.parseDouble(text_numB.getText().toString());
                double result=a+b;
                label_result.setText(result+"");

            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkValidInput()){
                    label_result.setText("Dữ liệu nhập không hợp lệ");
                    return;
                }
                double a=Double.parseDouble(text_numA.getText().toString());
                double b=Double.parseDouble(text_numB.getText().toString());
                double result=a-b;
                label_result.setText(result+"");

            }
        });
        btn_mutil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkValidInput()){
                    label_result.setText("Dữ liệu nhập không hợp lệ");
                    return;
                }
                double a=Double.parseDouble(text_numA.getText().toString());
                double b=Double.parseDouble(text_numB.getText().toString());
                double result=a*b;
                label_result.setText(result+"");

            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkValidInput()){
                    label_result.setText("Dữ liệu nhập không hợp lệ");
                    return;
                }
                double a=Double.parseDouble(text_numA.getText().toString());
                double b=Double.parseDouble(text_numB.getText().toString());
                double result=a/b;
                label_result.setText(result+"");

            }
        });
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);

            }
        });
    }
    private boolean checkValidInput(){
        try{
            final EditText text_numA=(EditText)findViewById(R.id.text_numA);
            final EditText text_numB=(EditText)findViewById(R.id.text_numB);
            double a=Double.parseDouble(text_numA.getText().toString());
            double b=Double.parseDouble(text_numB.getText().toString());
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
