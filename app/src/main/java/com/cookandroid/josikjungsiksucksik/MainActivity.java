package com.cookandroid.josikjungsiksucksik;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main_Activity";

    private TextView tvCount,tvCount2 ,tvCount3 ;
    private Button btnAdd,  btnMinus, btnAdd2, btnAdd3,btnMinus2,btnMinus3, Button;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount=findViewById(R.id.tv_count);
        tvCount.setText(count+"");
        tvCount3=findViewById(R.id.josik);
        tvCount.setText(count+"");
        tvCount2=findViewById(R.id.lunch);
        tvCount.setText(count+"");
        btnAdd=findViewById(R.id.btn_add);
        btnMinus=findViewById(R.id.btn_minus);
        btnAdd2=findViewById(R.id.btn_add2);
        btnMinus2=findViewById(R.id.btn_minus2);
        btnAdd3=findViewById(R.id.btn_add3);
        btnMinus3=findViewById(R.id.btn_minus3);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: btnAdd : "+v.getClass().getName());
                count++;
                tvCount.setText(count+"");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count>0) {
                    count--;
                    tvCount.setText(count + "");
                }
            }
        });
        btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: btnAdd : "+v.getClass().getName());
                count++;
                tvCount2.setText(count+"");
            }
        });

        btnAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: btnAdd : "+v.getClass().getName());
                count++;
                tvCount3.setText(count+"");
            }
        });
        btnMinus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count>0) {
                    count--;
                    tvCount2.setText(count + "");
                }
            }
        });
        btnMinus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count>0) {
                    count--;
                    tvCount3.setText(count + "");
                }
            }
        });
    }

    public void ClickButton(View view) {
        Toast.makeText(getApplicationContext(),"예약이 완료되었습니다.",Toast.LENGTH_LONG).show();
    }
}