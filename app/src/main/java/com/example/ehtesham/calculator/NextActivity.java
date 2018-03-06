package com.example.ehtesham.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    TextView T1;
    EditText E1,E2;
    Button add,sub,mul,div;
    double ans = 0;
    double a;
    double b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        T1 = (TextView)findViewById(R.id.rita);
        E1 = (EditText)findViewById(R.id.editText);
        E2 = (EditText)findViewById(R.id.editText2);

        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);


       /* add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
*/


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(E1.getText().toString().trim().length()==0 && E2.getText().toString().trim().length()==0)
                {


                    Toast.makeText(getApplicationContext(),"Enter the numbers",Toast.LENGTH_LONG).show();
                }

                else
                {
                    a = Double.parseDouble(E1.getText().toString().trim());
                    b = Double.parseDouble(E2.getText().toString().trim());
                    ans = a+b;

                    T1.setText(String.valueOf(ans));
                }


            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(E1.getText().toString().trim().length()==0 && E2.getText().toString().trim().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Enter the numbers",Toast.LENGTH_LONG).show();
                }

                else
                {
                    a = Double.parseDouble(E1.getText().toString().trim());
                    b = Double.parseDouble(E2.getText().toString().trim());
                    ans = a-b;

                    T1.setText(String.valueOf(ans));
                }


            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(E1.getText().toString().trim().length()==0 && E2.getText().toString().trim().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Enter the numbers",Toast.LENGTH_LONG).show();
                }

                else
                {

                    a = Double.parseDouble(E1.getText().toString().trim());
                    b = Double.parseDouble(E2.getText().toString().trim());
                    ans = a*b;

                    T1.setText(String.valueOf(ans));
                }


            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(E1.getText().toString().trim().length()==0 && E2.getText().toString().trim().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Enter the numbers",Toast.LENGTH_LONG).show();
                }

                else
                {

                    a = Double.parseDouble(E1.getText().toString().trim());
                    b = Double.parseDouble(E2.getText().toString().trim());
                    ans = a/b;

                    T1.setText(String.valueOf(ans));
                }


            }
        });
    }
}